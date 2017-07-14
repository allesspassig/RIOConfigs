package robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Loader extends Subsystem {

	SpeedController motor;

	public Loader() {
		motor = new Talon(RobotMap.PORT_LOADER);
		motor.setInverted(RobotMap.POLARITY_LOADER);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void setRaw(double speed) {
		motor.set(speed);
	}

}
