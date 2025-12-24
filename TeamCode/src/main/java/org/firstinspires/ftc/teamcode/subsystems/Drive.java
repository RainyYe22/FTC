package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.util.constants;

public class Drive {

    public DcMotor fl, fr, bl, br;
    private Telemetry telemetry;

    public Drive(HardwareMap hw, Telemetry tel) {
        telemetry = tel;

        fl = hw.get(DcMotor.class, constants.Drive.frontLeft);
        fr = hw.get(DcMotor.class, constants.Drive.frontRight);
        bl = hw.get(DcMotor.class, constants.Drive.backLeft);
        br = hw.get(DcMotor.class, constants.Drive.backRight);

        fl.setDirection(constants.Drive.frontLeftReverse ? DcMotor.Direction.REVERSE : DcMotor.Direction.FORWARD);
        fr.setDirection(constants.Drive.frontRightReverse ? DcMotor.Direction.REVERSE : DcMotor.Direction.FORWARD);
        bl.setDirection(constants.Drive.backLeftReverse ? DcMotor.Direction.REVERSE : DcMotor.Direction.FORWARD);
        br.setDirection(constants.Drive.backRightReverse ? DcMotor.Direction.REVERSE : DcMotor.Direction.FORWARD);

        fl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        br.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public Drive(double x, double y, double turn) {
        double flP = y + x + turn;
        double frP = y - x - turn;
        double blP = y - x + turn;
        double brP = y + x - turn;

        fl.setPower(flP);
        fr.setPower(frP);
        bl.setPower(blP);
        br.setPower(brP);
    }

    public void stop() {
        fl.setPower(0);
        fr.setPower(0);
        bl.setPower(0);
        br.setPower(0);
    }
}

