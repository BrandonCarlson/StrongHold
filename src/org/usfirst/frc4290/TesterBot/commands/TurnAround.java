package org.usfirst.frc4290.TesterBot.commands;

import org.usfirst.frc4290.TesterBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnAround extends Command {

    public TurnAround() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	setTimeout(1);
    	Robot.driveTrain.driveRightTurn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
