package org.usfirst.frc.team3756.robot.commands;
import org.usfirst.frc.team3756.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This JoystickDrive command class can be used during TeleOp play with the implementation of the Joystick object to be used along with the Robot class
 * The JoystickDrive class requires the driveTrain class to use the different subsystems created in driveTrain, more specifically the use of teleDrive for manual
 * operated drive capabilities.
 * 
 * @author  Omar Lopez
 * @version 1.0
 * @since   2017-01-12
 * 
 * *please record editor name and date below*
 */
public class JoystickDrive extends Command {

	// This method calls the driveTrain class from the Robot class to allow access to subsystem teleDrive
    public JoystickDrive() {
        requires(Robot.driveTrain);
    } // End of JoystickDrive() method

    // Called just before this Command runs the first time
    protected void initialize() {
    } // End of initialize() method

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.teleDrive(Robot.oi.getJoystick());
    } // End of execute() method

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    } // End of isFinished() method

    // Called once after isFinished returns true
    protected void end() {} 
    // End of end() method

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    } // End of interrupted() method
} // End of class
