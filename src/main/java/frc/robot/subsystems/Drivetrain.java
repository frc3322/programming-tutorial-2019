package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveControl;

public class Drivetrain extends Subsystem {

    DifferentialDrive robotDrive;

    public Drivetrain(){
    
        WPI_TalonSRX left1 = new WPI_TalonSRX(frc.robot.RobotMap.CAN.DRIVE_LEFT_1);
        WPI_TalonSRX left2 = new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT_2);
        WPI_TalonSRX left3 = new WPI_TalonSRX(RobotMap.CAN.INDENTURED_SERVANT_L);
        WPI_TalonSRX right1 = new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_1);
        WPI_TalonSRX right2 = new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_2);
        WPI_TalonSRX right3 = new WPI_TalonSRX(RobotMap.CAN.INDENTURED_SERVANT_R);

        SpeedControllerGroup leftGroup = new SpeedControllerGroup(left1, left2, left3);
        SpeedControllerGroup rightGroup = new SpeedControllerGroup(right1, right2, right3);

        robotDrive = new DifferentialDrive(leftGroup, rightGroup);

    }

    public void drive(double speed, double rotation){

        robotDrive.arcadeDrive(speed, rotation);

    }

    @Override
    protected void initDefaultCommand() {
        new DriveControl();
    }

}