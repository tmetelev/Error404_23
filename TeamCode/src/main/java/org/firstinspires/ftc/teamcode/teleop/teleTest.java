package org.firstinspires.ftc.teamcode.teleop;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Robot;

@TeleOp
public class teleTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot R = new Robot();
        R.init(this);

        FtcDashboard dashboard = FtcDashboard.getInstance();
        dashboard.startCameraStream(R.cam.camera, 30);
        dashboard.setTelemetryTransmissionInterval(500);
        
        waitForStart();

        R.teleLoop();



    }
}
