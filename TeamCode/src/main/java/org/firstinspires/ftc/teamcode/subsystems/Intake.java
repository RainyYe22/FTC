package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.constants;

public class Intake {

    private DcMotor motor;

    public Intake(HardwareMap hw) {
        motor = hw.get(DcMotor.class, constants.Intake.motorName);
    }

    public void in() {
        motor.setPower(constants.Intake.intakePower);
    }

    public void out() {
        motor.setPower(constants.Intake.outtakePower);
    }

    public void stop() {
        motor.setPower(0);
    }
}

