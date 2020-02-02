package org.ghrobotics.frc2019.subsystems.intake

import org.ghrobotics.lib.commands.FalconCommand

class IntakeCloseCommand : FalconCommand(IntakeSubsystem) {

    init {
        finishCondition += { true }
    }

    override suspend fun initialize() {
        IntakeSubsystem.wantedExtensionSolenoidState = IntakeSubsystem.ExtensionSolenoidState.RETRACTED
        IntakeSubsystem.wantedLauncherSolenoidState = false
    }

}