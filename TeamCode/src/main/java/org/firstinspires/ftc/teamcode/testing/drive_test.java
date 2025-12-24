package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TEST: Drive")
public class drive_test extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor fl = hardwareMap.dcMotor.get("frontLeft");
        DcMotor fr = hardwareMap.dcMotor.get("frontRight");
        DcMotor bl = hardwareMap.dcMotor.get("backLeft");
        DcMotor br = hardwareMap.dcMotor.get("backRight");

        waitForStart();

        while (opModeIsActive()) {

            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double r = gamepad1.right_stick_x;

            double flPower = y + x + r;
            double frPower = y - x - r;
            double blPower = y - x + r;
            double brPower = y + x - r;

            fl.setPower(flPower);
            fr.setPower(frPower);
            bl.setPower(blPower);
            br.setPower(brPower);

            telemetry.addData("FL", flPower);
            telemetry.addData("FR", frPower);
            telemetry.addData("BL", blPower);
            telemetry.addData("BR", brPower);
            telemetry.update();
        }
    }
}
