/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static class CAN {
    // Talons
    public static final int DRIVE_LEFT_1 = 6;
    public static final int DRIVE_LEFT_2 = 7;
    public static final int INDENTURED_SERVANT_L = 8;
    public static final int DRIVE_RIGHT_1 = 3;
    public static final int DRIVE_RIGHT_2 = 4;
    public static final int INDENTURED_SERVANT_R = 5;

    public static final int CLIMB_TALON_1 = 1;
    public static final int CLIMB_TALON_2 = 2;
  }
  
  public static class XBOX {
    // Buttons
    public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4;
    public static final int BUMPER_LEFT = 5;
    public static final int BUMPER_RIGHT = 6;
    public static final int BUTTON_BACK = 7;
    public static final int BUTTON_START = 8;
    public static final int STICK_LEFT = 9;
    public static final int STICK_RIGHT = 10;

    // Axes
    public static final int STICK_L_X_AXIS = 0;
    public static final int STICK_L_Y_AXIS = 1;
    public static final int STICK_R_X_AXIS = 4;
    public static final int STICK_R_Y_AXIS = 5;
    public static final int TRIGGER_L_AXIS = 2;
    public static final int TRIGGER_R_AXIS = 3;
  }
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
