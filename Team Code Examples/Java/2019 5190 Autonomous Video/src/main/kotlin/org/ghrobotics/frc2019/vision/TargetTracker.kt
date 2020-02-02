package org.ghrobotics.frc2019.vision

import edu.wpi.first.wpilibj.Timer
import org.ghrobotics.frc2019.Constants
import org.ghrobotics.frc2019.subsystems.drive.DriveSubsystem
import org.ghrobotics.lib.debug.LiveDashboard
import org.ghrobotics.lib.mathematics.twodim.geometry.Pose2d
import org.ghrobotics.lib.mathematics.twodim.geometry.Translation2d
import org.ghrobotics.lib.mathematics.units.Length
import org.ghrobotics.lib.mathematics.units.Rotation2d


object TargetTracker {

    private val targets = mutableSetOf<TrackedTarget>()

    fun update() {
        synchronized(targets) {
            val currentTime = Timer.getFPGATimestamp()

            val currentRobotPose = DriveSubsystem.localization()

            // Update and remove old targets
            targets.removeIf {
                it.update(currentTime, currentRobotPose)
                !it.isAlive
            }
            // Publish to dashboard
            LiveDashboard.visionTargets = targets.asSequence()
                .filter { it.isReal }
                .map { it.averagedPose2d }
                .toList()
        }
    }

    fun addSamples(creationTime: Double, samples: Iterable<Pose2d>) {
        if (creationTime >= Timer.getFPGATimestamp()) return // Cannot predict the future

        synchronized(targets) {
            for (samplePose in samples) {
                val closestTarget = targets.minBy {
                    it.averagedPose2d.translation.distance(samplePose.translation)
                }
                val sample = TrackedTargetSample(creationTime, samplePose)
                if (closestTarget == null
                    || closestTarget.averagedPose2d.translation.distance(samplePose.translation) > Constants.kTargetTrackingDistanceErrorTolerance.value
                ) {
                    // Create new target if no targets are within tolerance
                    targets += TrackedTarget(sample)
                } else {
                    // Add sample to target within tolerance
                    closestTarget.addSample(sample)
                }
            }
        }
    }

    fun getBestTarget(isFrontTarget: Boolean) = synchronized(targets) {
        targets.asSequence()
            .filter {
                if (!it.isReal) return@filter false
                val x = it.averagedPose2dRelativeToBot.translation.x
                if (isFrontTarget) x >= 0.0 else x <= 0.0
            }.minBy { it.averagedPose2dRelativeToBot.translation.norm }
    }

    fun getBestTargetUsingReference(referencePose: Pose2d, isFrontTarget: Boolean) = synchronized(targets) {
        targets.asSequence()
            .associateWith { it.averagedPose2d inFrameOfReferenceOf referencePose }
            .filter {
                val x = it.value.translation.x
                it.key.isReal && if (isFrontTarget) x > 0.0 else x < 0.0
            }
            .minBy { it.value.translation.norm }?.key
    }

    fun getAbsoluteTarget(translation2d: Translation2d) = synchronized(targets) {
        targets.asSequence()
            .filter {
                it.isReal
                    && translation2d.distance(it.averagedPose2d.translation) <= Constants.kTargetTrackingDistanceErrorTolerance.value
            }
            .minBy { it.averagedPose2d.translation.distance(translation2d) }
    }

    class TrackedTarget(
        initialTargetSample: TrackedTargetSample
    ) {

        private val samples = mutableSetOf<TrackedTargetSample>()

        /**
         * The averaged pose2d for x time
         */
        var averagedPose2d = initialTargetSample.targetPose
            private set

        var averagedPose2dRelativeToBot = Pose2d()
            private set

        /**
         * Targets will be "alive" when it has at least one data point for x time
         */
        var isAlive = true
            private set

        /**
         * Target will become a "real" target once it has received data points for x time
         */
        var isReal = false
            private set

        var stability = 0.0
            private set

        init {
            addSample(initialTargetSample)
        }

        fun addSample(newSamples: TrackedTargetSample) = synchronized(samples) {
            samples.add(newSamples)
        }

        fun update(currentTime: Double, currentRobotPose: Pose2d) = synchronized(samples) {
            // Remove expired samples
            samples.removeIf { currentTime - it.creationTime >= Constants.kTargetTrackingMaxLifetime.value }
            // Update State
            isAlive = samples.isNotEmpty()
            if (samples.size >= 2) isReal = true
            stability = (samples.size / (Constants.kVisionCameraFPS * Constants.kTargetTrackingMaxLifetime.value))
                .coerceAtMost(1.0)
            // Update Averaged Pose
            var accumulatedX = 0.0
            var accumulatedY = 0.0
            var accumulatedAngle = 0.0
            for (sample in samples) {
                accumulatedX += sample.targetPose.translation.x
                accumulatedY += sample.targetPose.translation.y
                accumulatedAngle += sample.targetPose.rotation.value
            }
            averagedPose2d = Pose2d(
                Length(accumulatedX / samples.size),
                Length(accumulatedY / samples.size),
                Rotation2d(accumulatedAngle / samples.size)
            )
            averagedPose2dRelativeToBot = averagedPose2d inFrameOfReferenceOf currentRobotPose
        }

    }

    data class TrackedTargetSample(
        val creationTime: Double,
        val targetPose: Pose2d
    )

}