// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4290.TesterBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4290.TesterBot.Robot;

/**
 *
 */
public class ChangeSpeed extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public ChangeSpeed(double speedChange) {  
    	Robot.driveTrain.speedMultiplier = speedChange;
    	SmartDashboard.putNumber("Auto Speed 4", Robot.driveTrain.speedMultiplier);
//    	if (Robot.driveTrain.speedMultiplier > 1.05){
//    		Robot.driveTrain.speedMultiplier = 1.05;
//    		SmartDashboard.putNumber("Max", Robot.driveTrain.speedMultiplier);
//    	}
//    	else if (Robot.driveTrain.speedMultiplier < 0.55){
//    		Robot.driveTrain.speedMultiplier = 0.55;
//    		SmartDashboard.putNumber("Min", Robot.driveTrain.speedMultiplier);
//    	}
//    	else {
//    		Robot.driveTrain.speedMultiplier += speedChange;
//    		SmartDashboard.putNumber("Current", Robot.driveTrain.speedMultiplier);
//    	}
    	Robot.driveTrain.updateCurve();
    	//SmartDashboard.putNumber("Multiplier", Robot.driveTrain.speedMultiplier);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
