package org.usfirst.frc.team3756.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * This command group class is used to allow a more efficient sequence of autonomous commands, or allow autonomous and manual commands
 * to be used at the same instance with the addSequential and addParallel methods
 * - Further detail on each method in CommandGroupA method
 * 
 * @author  Omar Lopez
 * @version 1.0
 * @since   2017-01-12
 *
 * *please record editor name and date below*
 */
public class CommandGroupA extends CommandGroup {

    public CommandGroupA() {
    	// Initialize placeholders for TimeDrive parameters
    	double placeholdTime = 0;
    	double placeholdSpeed = 0;
    	double placeholdCurve = 0;
        
    	// Use addSequential to create a sequence of commands
        addSequential(new TimeDrive(placeholdTime, placeholdSpeed, placeholdCurve));
        addSequential(new TimeDrive(placeholdTime, placeholdSpeed, placeholdCurve));
        //...
        
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        
        /** FOOTNOTE:
         * 	addParallel() can be combined with different commands such as TimeDrive and
         *  a specified autonomous command (e.g. controlling gear-pickup arm with TimeDrive)
         *  or combining JoystickDrive with autonomous conveyer command
         */
    }// End of commandGroupA
} // End of class
