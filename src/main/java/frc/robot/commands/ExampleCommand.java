package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;


/**
 * This is an example of how Commands are created in Robot Programming.<p>
 *
 * Notice how we use the words "extends CommandBase" at the end of our Class Name. From the bootcamp slides, it means
 * that we are adding additional features to our class, in this case turning it into a "command". There are many
 * features that a Command has, and some significant ones are listed below. Try taking a look at the comments left
 * above each method, as you will be writing something similar to this in the MotorLab.
 */
public class ExampleCommand extends CommandBase {

    /**
     * Any code inside this method will run a single time when the Command is about to start. It is useful
     * to put the "addRequirement" method to indicate we are going to use a Subsystem.
     */
    @Override
    public void initialize() {

    }

    /**
     * Any code inside this method will run FOREVER until the Command has stopped.<p>
     *
     * For moving a motor, this method would be best used for telling the motor to continue moving at the speed
     * we want.
     */
    @Override
    public void execute() {
        super.execute();
    }

    /**
     * Any code inside this method will run a single time after the Command is required to stop. For example,
     * if this command was used for moving a motor, this code would tell the Motor to stop.<p>
     *
     * The interrupted option is TRUE if the Command was interrupted/canceled without the Command specifically
     * requesting it wanted to end.
     */
    @Override
    public void end(boolean interrupted) {

    }

    /**
     * This method is designed to contain a "return" statement, which would be the condition that you want the
     * Command to stop. While the command is running, this will always be checked, and as soon as the condition
     * is met, it will end the command.<p>
     *
     * For example, for a motor control command, a good piece of code to put here would be
     * return (motor has moved for 10 seconds?)<p>
     *
     * In some cases, you do not want the Command to stop, and you will put "return false". This makes sense for
     * code such as the Driving System, as you don't want the Robot to stop driving on its own.
     *
     * @return whether the command has finished.
     */
    @Override
    public boolean isFinished() {
        // Returning true makes the command instantly stop running after calling initialize and execute, thus
        // making it only run ONCE.
        return true;
    }
}
