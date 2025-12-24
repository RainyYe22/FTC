package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name = "TEST: Motors & Servos")
public class motor_servo_test extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor testMotor = hardwareMap.dcMotor.get("motorTest");
        Servo testServo = hardwareMap.servo.get("servoTest");

        double servoPos = 0.5;

        waitForStart();

        while (opModeIsActive()) {

            // Motor test: Right trigger forward, left trigger backward
            double motorPower = gamepad1.right_trigger - gamepad1.left_trigger;
            testMotor.setPower(motorPower);

            // Servo test: A increases, B decreases
            if (gamepad1.a) servoPos += 0.01;
            if (gamepad1.b) servoPos -= 0.01;

            servoPos = Math.max(0, Math.min(1, servoPos));
            testServo.setPosition(servoPos);

            telemetry.addData("Motor Power", motorPower);
            telemetry.addData("Servo Pos", servoPos);
            telemetry.update();
        }
    }
}

