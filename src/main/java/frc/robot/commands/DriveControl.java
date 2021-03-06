package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

import static frc.robot.Robot.drivetrain;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveControl extends Command {

  private final int SPEED_AXIS;
  private final int ROTATION_AXIS;
  public DriveControl() {
    // Use requires() here to declare subsystem dependencies
    requires(drivetrain);

    SPEED_AXIS = RobotMap.XBOX.STICK_L_Y_AXIS;
    ROTATION_AXIS = RobotMap.XBOX.STICK_R_X_AXIS;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    drivetrain.drive(SPEED_AXIS, ROTATION_AXIS);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}