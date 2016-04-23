package org.usfirst.frc4290.TesterBot.subsystems;

import org.usfirst.frc4290.TesterBot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gyro extends Subsystem {
    
	private ADXRS450_Gyro gyro = RobotMap.gyro;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void resetGyro(){
    	gyro.reset();
    }
    public double getGyroAngle(){
    	return gyro.getAngle();
    }
}

