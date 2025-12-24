package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.util.constants;

public class Launch {

    private Servo servo;

    public Launch(HardwareMap hw) {
        servo = hw.get(Servo.class, constants.Launch.servoName);
    }

    public void fire() {
        servo.setPosition(constants.Launch.firePosition);
    }

    public void reset() {
        servo.setPosition(constants.Launch.resetPosition);
    }
}
