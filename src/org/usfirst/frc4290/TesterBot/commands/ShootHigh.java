package org.usfirst.frc4290.TesterBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ShootHigh extends CommandGroup {
    
    public  ShootHigh() {
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
    	addParallel(new AutoRaiseArm(), 1);
    	addSequential(new GrabBall(0.0), .5);
    	addParallel(new LowerClimber(), 2);	
    	addParallel(new AutoLowerArm(), 2);
    	
    }
}
