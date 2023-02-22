package org.firstinspires.ftc.teamcode.autonomus;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.Claw;
import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous
public class AutonomusPark extends LinearOpMode {
    public static int timeX = 1150;
    public static int timeY = 1400;
    public static int pos = 21;
    public static double voltage = 12.74;

    @Override
    public void runOpMode() throws InterruptedException {
        Robot R = new Robot();
        R.init(this);



        while (!isStarted()) {
            pos = R.cam.currentVisableId();
        }

        timeX *= voltage / R.voltageSensor.getVoltage();
        timeY *= voltage / R.voltageSensor.getVoltage();

        if (pos == 23) {
            R.claw.close();
            R.dr.followDirection(-1, -0.1, 0, false, false);
            sleep(timeX + 100);
            R.dr.followDirection(0, 0, 0, false, false);
            R.dr.GoAngle(0);
            R.dr.followDirection(-0.2, 1, 0, false, false);
            sleep(timeY);
            R.dr.followDirection(0, 0, 0, false, false);
            R.dr.GoAngle(0);
        }
        if (pos == 22) {
            R.claw.close();
            R.dr.followDirection(-0.2, 1, 0, false, false);
            sleep(timeY + 100);
            R.dr.followDirection(0, 0, 0, false, false);
            R.dr.GoAngle(0);
        }
        if (pos == 21) {
            R.claw.close();
            R.dr.followDirection(1, -0.1, 0, false, false);
            sleep(timeX);
            R.dr.followDirection(0, 0, 0, false, false);
            R.dr.GoAngle(0);
            R.dr.followDirection(-0.2, 1, 0, false, false);
            sleep(timeY);
            R.dr.followDirection(0, 0, 0, false, false);
            R.dr.GoAngle(0);
        }
    }
}
