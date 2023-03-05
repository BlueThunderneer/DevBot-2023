package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Vision;


public class MoveRobot extends CommandBase {
    private final Drivetrain m_drivetrain;
    private final Vision m_vision; 
    
    public MoveRobot(Drivetrain drivetrain, Vision vision, double Distance){
        m_vision = vision;
        m_drivetrain = drivetrain;
    }
    
    
    @Override
    public void initialize(){
    
        }
    
    @Override
    public void execute(){
        double ta = m_vision.getTA();
        if (ta > 1.5){
            m_drivetrain.arcadeDrive(0, 0);
            end(true);
    
        }else{
            m_drivetrain.arcadeDrive(0.65, 0);
    
        }
        }
    }
