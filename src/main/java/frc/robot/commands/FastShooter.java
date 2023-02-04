package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class FastShooter extends CommandBase {
    public FastShooter(){
        addRequirements(Shooter.getInstance());
    }
    @Override
    public void initialize(){
        
    }

    @Override
    public void execute(){
        //Robot.m_Shooter.toggleSpin();
        //Robot.m_Shooter.FastWheel();
        
    }

    @Override
    public boolean isFinished(){
        return true;
    }

    @Override
    public void end(boolean interrupted){
    }

    
    
}
