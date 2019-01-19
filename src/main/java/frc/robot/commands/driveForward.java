package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import static frc.robot.Robot.drivetrain;

public class driveForward extends Command{

    public driveForward(){

        requires(drivetrain);

    }

    @Override
    protected void initialize() {
        
        drivetrain.drive(1, 1);

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    

}