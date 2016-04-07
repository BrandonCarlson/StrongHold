// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4290.TesterBot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Jaguar;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTraindriveRightMotor;
    public static SpeedController driveTraindriveLeftMotor;
    public static RobotDrive driveTrainRobotDrive2;
    public static SpeedController driveTraindriveRightOneMotor;
    public static SpeedController driveTraindriveRightTwoMotor;
    public static SpeedController driveTraindriveLeftOneMotor;
    public static SpeedController driveTraindriveLeftTwoMotor;
    public static RobotDrive driveTrainRobotDrive4;
    //public static Relay rollerSubroller;
    public static VictorSP rollerVictor;
    public static DoubleSolenoid pneumaticsleftSolonoid;
    public static DoubleSolenoid pneumaticsClimberSolonoid;
    public static Relay spike;
    public static Compressor pneumaticscompressor;
    public static Jaguar jaguar;
    public static Jaguar jaguarTwo;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public final static double Drive_Forward_One = 1;
    public final static double Drive_Forward_Two = 2;
    public final static double Drive_Forward_Three = 3;
    public final static double Drive_Forward_Four = 4;
    public final static double Drive_Forward_Five = 5;
    public final static double Drive_Forward_Six = 6;
    
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTraindriveRightMotor = new Talon(10);
        LiveWindow.addActuator("DriveTrain", "driveRightMotor", (Talon) driveTraindriveRightMotor);
        
        driveTraindriveLeftMotor = new Talon(11);
        LiveWindow.addActuator("DriveTrain", "driveLeftMotor", (Talon) driveTraindriveLeftMotor);
        
        driveTrainRobotDrive2 = new RobotDrive(driveTraindriveLeftMotor, driveTraindriveRightMotor);
        
        driveTrainRobotDrive2.setSafetyEnabled(true);
        driveTrainRobotDrive2.setExpiration(0.1);
        driveTrainRobotDrive2.setSensitivity(0.5);
        driveTrainRobotDrive2.setMaxOutput(1.0);

        driveTraindriveRightOneMotor = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "driveRightOneMotor", (Talon) driveTraindriveRightOneMotor);
        
        driveTraindriveRightTwoMotor = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "driveRightTwoMotor", (Talon) driveTraindriveRightTwoMotor);
        
        driveTraindriveLeftOneMotor = new Talon(4);
        LiveWindow.addActuator("DriveTrain", "driveLeftOneMotor", (Talon) driveTraindriveLeftOneMotor);
        
        driveTraindriveLeftTwoMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "driveLeftTwoMotor", (Talon) driveTraindriveLeftTwoMotor);
        
        driveTrainRobotDrive4 = new RobotDrive(driveTraindriveLeftOneMotor, driveTraindriveLeftTwoMotor,
              driveTraindriveRightOneMotor, driveTraindriveRightTwoMotor);
        
        driveTrainRobotDrive4.setSafetyEnabled(true);
        driveTrainRobotDrive4.setExpiration(0.1);
        driveTrainRobotDrive4.setSensitivity(0.5);
        driveTrainRobotDrive4.setMaxOutput(1.0);

        //rollerSubroller = new Relay(0);
        //LiveWindow.addActuator("RollerSub", "roller", rollerSubroller);
        
        rollerVictor = new VictorSP(6);
//        spike = new Relay (4);
        
        pneumaticsleftSolonoid = new DoubleSolenoid(0, 1);
        LiveWindow.addActuator("Pneumatics", "leftSolonoid", pneumaticsleftSolonoid);
        
        pneumaticsClimberSolonoid = new DoubleSolenoid(2, 3);
//        LiveWindow.addActuator("Pneumatics", "climbSolonoid", pneumaticsrightSolonoid);
//        
        pneumaticscompressor = new Compressor(0);
        jaguar = new Jaguar(7);
        jaguarTwo = new Jaguar(8);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
