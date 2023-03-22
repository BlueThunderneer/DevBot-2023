package frc.robot.commands;
import frc.robot.commands.BalanceLoop;
import frc.robot.commands.AutoBalance;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonTime3 extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on time. This will drive out for a period of time, turn
   * around for time (equivalent to time to turn around) and drive forward again. This should mimic
   * driving out, turning around and driving back.
   *
   * 
   */
  public AutonTime3(Drivetrain m_drivetrain) {

    addCommands(
 //Raise the Cargo arm to shoot need to add this subsystem to the contstructor)
        //new armdownTime(0.5, m_armss),
        //new DriveDistance( 0.75, 0, 216, m_drivetrain )
        //new DriveTime(m_speed , 0.0, 2.0, m_drivetrain) // go backwards for X seconds
        new BalanceLoop(6, m_drivetrain)

        // Caffiene addiction lvl 100
        ); //end of addCommands
     
  }    
}
