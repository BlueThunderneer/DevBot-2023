package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonTime extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on time. This will drive out for a period of time, turn
   * around for time (equivalent to time to turn around) and drive forward again. This should mimic
   * driving out, turning around and driving back.
   *
   * 
   */
  public AutonTime(Drivetrain m_drivetrain) {
       addCommands(
       // new ArmupTime(3.0, m_ArmSS), //Raise the Cargo arm to shoot need to add this subsystem to the contstructor)
        //new ArmdownTime(1.0, m_ArmSS),
        new DriveTime(-0.75, 0.0, 2.0, m_drivetrain), //Drive using these params (speed,Rotation,Time,Subsystem used)
        new DriveTime( 0, -0.75, 2.0, m_drivetrain ) // we spin around
        //new DriveTime( 0.55, 0.0, 2.0, m_drivetrain) // go forward after spin
        
        ); //end of addCommands
     
  }    
}
