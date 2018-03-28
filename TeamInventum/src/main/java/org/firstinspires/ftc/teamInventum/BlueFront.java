package org.firstinspires.ftc.teamInventum;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamInventum.HardwareInventum.BLUE;
import static org.firstinspires.ftc.teamInventum.HardwareInventum.RED;
import static org.firstinspires.ftc.teamInventum.HardwareInventum.TURN_FORWARDS;
import static org.firstinspires.ftc.teamInventum.HardwareInventum.TURN_LEFT;
import static org.firstinspires.ftc.teamInventum.HardwareInventum.TURN_RIGHT;

@Autonomous(name="BlueFront")
public class BlueFront extends AutoInnoMK3 {
	@Override
	public void runOpMode() throws InterruptedException {
		autonomousInit();
		waitForStart();
		autonomousStart();
		if (!isStopRequested()) {
			grab(true); // grab the block
			sleep(200);
			robot.frontClamp.setPower(1); sleep(400); robot.frontClamp.setPower(0); // raise the clamp
			jewelDisplacer(BLUE); // displace the jewel
			move(-0.3,700); // Drive off the platform
			turn(-20,.3); // Turn away from the shelf a little
            move(-0.3,700); // Drive away from platform
            turn(TURN_LEFT,.3); // Turn toward shelf
            move(-0.3,500); // Go toward shelf
			grab(false); // drop the block
			move(0.3,250); // Back up a little
		}
	}
}