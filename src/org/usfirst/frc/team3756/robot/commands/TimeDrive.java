package org.usfirst.frc.team3756.robot.commands;
import org.usfirst.frc.team3756.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This TimeDrive command class can be used during autonomous play with the implementation of adjustable parameters to be used along with the command group classes
 * The TimeDrive class requires the driveTrain class to use the different subsystems created in driveTrain, more specifically the use of autoDrive for autonomous drive
 * capabilities.
 * 
 * @author  Omar Lopez
 * @version 1.0
 * @since 	2017-01-12
 * 
 * *please record editor name and date below*
 */
public class TimeDrive extends Command {
	// Declare and instantiate public parameters for TimeDrive method
	public Timer timer;
	public double time;
	public double speed;
	public double curve;
	
	/* This method is used to create the autonomous simulation for the robot
	 * the method uses adjustable parameters for specific actions the driver chooses to execute
	 */
    public TimeDrive(double time, double speed, double curve) {
        requires(Robot.driveTrain);
        this.time = time;
        this.speed = speed;
        this.curve = curve;
    } // End of TimeDrive() method

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = new Timer();
    	timer.start();
    } // End of initialize() method

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.autoDrive(speed, curve);
    } // End of execute() method

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(timer.get() >= time){
    		return true;
    	}
    	else {
    		return false;	
    	}
    } // End of isFinished() method

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stopDT();
    	timer.stop();
    } // End of end() method

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {}
    // End of interrupted() method
} // End of class
