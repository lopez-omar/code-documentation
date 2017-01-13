package org.usfirst.frc.team3756.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team3756.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * 
 * @author 	unknown
 * @version 1.0
 * @since 	2017-01-12
 * 
 * *please record editor name and date below*
 * edited on 2017-01-12 by Omar Lopez
 */
public class OI {
	// Declare and instantiate Joystick object from the wpilibj 
	public Joystick joy = new Joystick(0);
	
	// This OI method is necessary so command classes can use getJoystick() method from Robot class
	public OI() {}
	// End of OI() method
	
	// This Joystick method is necessary to return the capabilities of a Joystick object to the JoystickDrive command class 
	public Joystick getJoystick(){
		return joy;
	} // End of getJoystick() method
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
