package org.usfirst.frc.team3756.robot.subsystems;
import org.usfirst.frc.team3756.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/** 
 * This DriveTrain subsystem contains 3 major methods to control the drive functions going to be used on the robot
 * teleDrive() which is a method used to drive the robot with a joystick, operated by a human driver
 * autoDrive() which is a method used to drive the robot autonomously, through pre-programmed commands
 * stopDT() which is a method that will be called whenever the driver wants to stop the motors from running
 * 
 * @author  Omar Lopez
 * @version 1.0
 * @since   2017-01-12 
 * 
 * *Please enter your name and the date you edited*
 */
public class DriveTrain extends Subsystem {
	/** DECLARE AND INSTANTIATE VARIABLES
	 * SpeedController object is used to control
	 * the speed of designated wheels, referenced through
	 * the VictorSP controllers
	 */
	public SpeedController leftBack;   // Control the speed of the Back-Left wheel
	public SpeedController leftFront;  // Control the speed of the Front-Left wheel
	public SpeedController rightFront; // Control the speed of the Front-Right wheel
	public SpeedController rightBack;  // Control the speed of the Back-Left wheel
	public RobotDrive produceBin; 
	
    /* Put methods for controlling this subsystem here. 
     * Call these from Commands.
	 */
	public DriveTrain(){
		// Declare each wheel to the corresponding VictorSP controller
		// **CONNECT TO CORRECT SLOTS OR DAMAGE MAY BE CAUSED TO ROBOT**
		leftBack = new VictorSP(0);
		leftFront = new VictorSP(1);
		rightBack = new VictorSP(2);
		rightFront = new VictorSP(3);
		
		// Declare the RobotDrive object
		// RobotDrive is crucial: this object compresses the commands used for 6 wheels into 4 wheels
		produceBin = new RobotDrive(leftBack, leftFront, rightFront, rightBack);
	}
	
	/* This method allows the user to use the joystick as a manual operated controller
	 * - Use this method during TeleOp (Experienced Driver Recommended)
	 */
	public void teleDrive(Joystick joy){
		produceBin.arcadeDrive(joy);
	} // End of teleDrive() method
	
	/* This method allows the user to use pre-programmed commands to drive the robot autonomously
	 * - Use this method during Autonomous (Make sure to double check parameters before running)
	 */
	public void autoDrive(double straight, double turn){
		produceBin.drive(straight, turn);
	} // End of autoDrive() method
	
	/* This method allows the user to halt the motor (disable)
	 * - Use this method when you wish to stop the drive train from operating (Only use when necessary)
	 */
	public void stopDT(){
		produceBin.drive(0, 0);
	} // End of stopDT() method

	/* This method is called automatically upon start up of robot code, it will automatically run in
	 * teleDrive mode (manual joystick drive)
	 */
    public void initDefaultCommand() {
        // Set the default command for a subsystem here
        setDefaultCommand(new JoystickDrive());
    } // End of initDefaultCommand() method
}// End of class

