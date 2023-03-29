package org.firstinspires.ftc.teamcode.robot;

import static java.lang.Thread.sleep;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Config
public class Elevator {

    Robot R;
    DcMotor elevator;
    HardwareMap hwd;

    public Elevator (HardwareMap hwd, Robot R) {
        this.R = R;
        this.hwd = hwd;
        elevator = hwd.get(DcMotor.class, "elv");


        elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void ElevatorButton() throws InterruptedException {
        int position = elevator.getCurrentPosition();
        elevator.setPower(-0.5);
        sleep(1100);
        while (elevator.getCurrentPosition() != position) {
            elevator.setPower(-0.5);
            sleep(1100);
            position = elevator.getCurrentPosition();
        }
        elevator.setPower(0);
    }
    public static double Power = -0.5;
    public static int High = 1;

    public static double PowerLong = -0.5;

    public void ElevatorLow() throws InterruptedException {
        int pos = elevator.getCurrentPosition();
        int difference = elevator.getCurrentPosition() + High;
        double err = difference - elevator.getCurrentPosition();
        while (elevator.getCurrentPosition() < difference) {
            err = difference - elevator.getCurrentPosition();
            if (err > 0) {
                elevator.setPower(Power);
            }
            if (err == 0) {
                elevator.setPower(Power);
            }
            if (err < 0) {
                elevator.setPower(Power);
            }
        }
        elevator.setPower(PowerLong);
        while (Math.abs(R.gamepad1.right_stick_y) < 0.2) {
            }
        elevator.setPower(0);
    }


    public void ElevatorMove(double power) {
        if (power > 0) {
            elevator.setPower(power * 0.03);
        } else {
            elevator.setPower(power);
        }
    }
}

