package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Vision;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class AquireTarget extends CommandBase {
    private final Vision m_vision;
    private final Drivetrain m_drivetrain;

public AquireTarget(Drivetrain drive, Vision look) {
    m_vision = look;
    m_drivetrain = drive;
}


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivetrain.arcadeDrive(0, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.arcadeDrive(-0.65, 0);

    }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.arcadeDrive(0, 0);
  }

  @Override
  public boolean isFinished() {
    double ta = m_vision.getTA();
    return (ta > 0.5);
}
}


 


    
