/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  Joystick joystick = new Joystick(0);

  Button buttonA = new JoystickButton(joystick, RobotMap.XBOX.BUTTON_A);
  Button buttonB = new JoystickButton(joystick, RobotMap.XBOX.BUTTON_B);
  Button buttonX = new JoystickButton(joystick, RobotMap.XBOX.BUTTON_X);

  public OI(){

    buttonA.whenPressed(new driveForward());
    
    buttonB.whenPressed(new turnRight());
    buttonX.whenPressed(new DriveBackwords());
  }

}
