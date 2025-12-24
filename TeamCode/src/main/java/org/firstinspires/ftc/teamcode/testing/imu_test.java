package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.hardware.limelightvision.LLResult; // ignore if unused
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TEST: IMU Heading")
public class imu_test extends LinearOpMode {

    @Override
    public void runOpMode() {
        BNO055IMU imu = hardwareMap.get(BNO055IMU.class, "imu");

        BNO055IMU.Parameters params = new BNO055IMU.Parameters();
        params.angleUnit = BNO055IMU.AngleUnit.RADIANS;
        imu.initialize(params);

        waitForStart();

        while (opModeIsActive()) {
            double heading = imu.getAngularOrientation().firstAngle;

            telemetry.addData("Heading (rad)", heading);
            telemetry.addData("Heading (deg)", Math.toDegrees(heading));
            telemetry.update();
        }
    }
}

