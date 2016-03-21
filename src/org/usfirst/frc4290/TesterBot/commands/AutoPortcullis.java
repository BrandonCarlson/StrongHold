package org.usfirst.frc4290.TesterBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoPortcullis extends CommandGroup {
    
    public  AutoPortcullis() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addParallel(new AutoLowerArm(), 1.2);
    	addSequential(new MoveForward(0.0), 2);
//    	addSequential(new AutoRaiseArm(), 0.5);
    	addParallel(new AutoRaiseArm(), 4);
//    	addSequential(new MoveBackward(0.0), 0.1);
    	addSequential(new MoveForward(0.0), 3.5);
    	addSequential(new AutoTwo());

    }
}
