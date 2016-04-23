package org.usfirst.frc4290.TesterBot.commands;

import org.usfirst.frc4290.TesterBot.Robot;
import org.usfirst.frc4290.TesterBot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SlowRightTurn extends Command {
	private double turnAngle = 0;
    public SlowRightTurn(double angle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	turnAngle = angle;
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double gyroAngle = Robot.gyroSub.getGyroAngle();
    	if (gyroAngle < turnAngle || gyroAngle > 300){
    		Robot.driveTrain.driveSlowRightTurn();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
