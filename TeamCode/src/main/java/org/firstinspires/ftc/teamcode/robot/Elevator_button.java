package org.firstinspires.ftc.teamcode.robot;

import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Elevator_button {
    Robot R;
    DcMotor elevator;
    HardwareMap hwd;

    public Elevator_button (HardwareMap hwd, Robot R) {
        this.R = R;
        this.hwd = hwd;
        elevator = hwd.get(DcMotor.class, "elv");

        elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void ElevatorButton() throws InterruptedException {
        int position = elevator.getCurrentPosition();
        elevator.setPower(0.5);
        sleep(10);
        while (elevator.getCurrentPosition() != position) {
            elevator.setPower(0.5);
            sleep(10);
            position = elevator.getCurrentPosition();
        }
    }
}

