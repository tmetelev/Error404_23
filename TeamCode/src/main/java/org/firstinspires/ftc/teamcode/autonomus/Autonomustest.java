package org.firstinspires.ftc.teamcode.autonomus;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous
public class Autonomustest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot R = new Robot();
        R.init(this);

        while (!isStarted()) {
            R.cam.currentVisableId();
        }

        waitForStart();
//        R.dr.GoPoint(50, 100);
//        R.dr.GoPoint(0, 0);
    }
}
