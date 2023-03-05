package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Vision;

public class TurnRobot extends CommandBase {
private final Drivetrain m_drivetrain;
private final Vision m_vision; 

public TurnRobot(Drivetrain drivetrain, Vision vision){
    m_vision = vision;
    m_drivetrain = drivetrain;
}


@Override
public void initialize(){

    }

@Override
public void execute(){
    double tx = m_vision.getTX();
    if (tx > 5){
        m_drivetrain.arcadeDrive(0, -0.7);

    }if (tx < -5){
        m_drivetrain.arcadeDrive(0, 0.7);

    }
    }
}
