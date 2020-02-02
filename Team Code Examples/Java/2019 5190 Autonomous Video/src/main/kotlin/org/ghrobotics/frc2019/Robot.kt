/*
 * FRC Team 5190
 * Green Hope Falcons
 */

package org.ghrobotics.frc2019

import edu.wpi.cscore.VideoMode
import edu.wpi.first.cameraserver.CameraServer
import edu.wpi.first.wpilibj.livewindow.LiveWindow
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard
import org.ghrobotics.frc2019.auto.Autonomous
import org.ghrobotics.frc2019.subsystems.EmergencyHandleable
import org.ghrobotics.frc2019.subsystems.arm.ArmSubsystem
import org.ghrobotics.frc2019.subsystems.climb.ClimbSubsystem
import org.ghrobotics.frc2019.subsystems.drive.DriveSubsystem
import org.ghrobotics.frc2019.subsystems.elevator.ElevatorSubsystem
import org.ghrobotics.frc2019.subsystems.intake.IntakeSubsystem
import org.ghrobotics.frc2019.vision.JeVoisManager
import org.ghrobotics.frc2019.vision.TargetTracker
import org.ghrobotics.lib.commands.FalconSubsystem
import org.ghrobotics.lib.mathematics.units.millisecond
import org.ghrobotics.lib.wrappers.FalconRobot

val kMainLoopDt = 20.millisecond

object Robot : FalconRobot() {

    val emergencyReadySystems = ArrayList<EmergencyHandleable>()

    var emergencyActive = false
    var debugActive = false

    val shouldDebug get() = debugActive || !lastEnabledState

    // Initialize all systems.
    init {
        LiveWindow.disableAllTelemetry()

        +DriveSubsystem
        +ClimbSubsystem
        +ElevatorSubsystem
        +ArmSubsystem
        +IntakeSubsystem

        Network
        Autonomous
        JeVoisManager
        TargetTracker

//        val camera = CameraServer.getInstance().startAutomaticCapture(0)
//        camera.setVideoMode(VideoMode.PixelFormat.kMJPEG, 320, 240, 15)
//
//        Shuffleboard.getTab("5190").add(camera).withPosition(3, 2).withSize(3, 3)
    }

    override fun periodic() {
        Controls.update()
        LEDs.update()
        Autonomous.update()
        Network.update()
        TargetTracker.update()
    }

    override operator fun FalconSubsystem.unaryPlus() {
        addToSubsystemHandler(this)
        if (this is EmergencyHandleable) {
            emergencyReadySystems.add(this)
        }
    }
}

fun main() {
    FalconRobot.startRobot({ Robot }, kMainLoopDt)
}