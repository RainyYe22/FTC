package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;

import org.firstinspires.ftc.teamcode.subsystems.*;

public class Robot {

    public Drive drive;
    public Intake intake;
    public Launch launch;
    public Vision vision;

    private HardwareMap hardwareMap;
    private Telemetry telemetry;

    public Robot(HardwareMap hw, Telemetry tel) {
        this.hardwareMap = hw;
        this.telemetry = tel;

        drive = new Drive(hardwareMap, telemetry);
        intake = new Intake(hardwareMap);
        launch = new Launch(hardwareMap);
        //vision = new Vision(hardwareMap, telemetry);
    }

    public void update() {
        // Called every loop during TeleOp
        if (drive != null) drive.update();
        if (vision != null) vision.update();
    }
}

