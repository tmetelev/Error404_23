package org.firstinspires.ftc.teamcode.robot;

import static java.lang.Thread.sleep;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Config
public class Claw {
    Robot R;
    Servo clawA, clawB;
    HardwareMap hwd;

    public static double closeA = 0.45;
    public static double openA = 0.73;
    public static double closeB = 0.5;
    public static double openB = 0.26;

    public Claw(HardwareMap hwd, Robot R) {
        this.R = R;
        this.hwd = hwd;
        clawA = hwd.get(Servo.class, "clawA");
        clawB = hwd.get(Servo.class, "clawB");
    }

    public void close() {
        clawA.setPosition(closeA);
        clawB.setPosition(closeB);
    }

    public void open() {
        clawA.setPosition(openA);
        clawB.setPosition(openB);
    }

    boolean flag = true;
    public void ClawMove(boolean position1) throws InterruptedException {
        if (position1) {
            flag = !flag;
            sleep(200);
        }
        if (!flag) {
            close();
        } else {
            open();
        }
        R.tele.addData("flag:", flag);

    }
}
