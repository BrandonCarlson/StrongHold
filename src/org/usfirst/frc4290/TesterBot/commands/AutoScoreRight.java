package org.usfirst.frc4290.TesterBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoScoreRight extends CommandGroup {
    
    public  AutoScoreRight() {
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
    	addSequential(new AutoRaiseArm(), 1);
    	addSequential(new MoveForward(0.0), 1.8);
//    	addSequential(new AutoRaiseArm(), 0.5);
    	addSequential(new SlowLeftTurn(), 0.7);
    	addParallel(new AutoLowerArm(), 10);
    	addSequential(new MoveForward(0.0), 2);
    	addSequential(new GrabBall(0.0), 5);

    }
}
