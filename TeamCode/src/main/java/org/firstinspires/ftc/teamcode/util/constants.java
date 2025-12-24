package org.firstinspires.ftc.teamcode.util;

public class constants {

    // DRIVE
    public static class Drive {
        // Motor names (fill in from whatever they are in hub)
        public static String frontLeft = "";
        public static String frontRight = "";
        public static String backLeft = "";
        public static String backRight = "";

        // Physical measurements
        public static double trackWidth = 0.0;       // inches
        public static double wheelBase = 0.0;        // inches
        public static double wheelRadius = 0.0;      // inches

        // Encoder + motor values
        public static double ticksPerRev = 0.0;
        public static double gearRatio = 1.0;        // wheel : motor
        public static double maxRpm = 0.0;

        // IMU name (standard is "imu")
        public static String imuName = "imu";

        // Road Runner constraints (fill in after tuning)
        public static double maxVel = 0.0;           // in/s
        public static double maxAccel = 0.0;         // in/s^2
        public static double maxAngVel = 0.0;        // rad/s
        public static double maxAngAccel = 0.0;      // rad/s^2

    }


    // INTAKE
    public static class Intake {
        public static String motorName = "";
        public static double intakePower = 1.0;
        public static double outtakePower = -1.0;
    }


    // LAUNCH
    public static class Launch {
        public static String servoName = "";
        public static double firePosition = 0.0;
        public static double resetPosition = 0.0;
    }


    // VISION
    public static class Vision {
        public static String idk;
    }


    // PID
    public static class PID {
        // Drive position PID
        public static double drive_kP = 0.0;
        public static double drive_kI = 0.0;
        public static double drive_kD = 0.0;

        // Heading PID (turning)
        public static double heading_kP = 0.0;
        public static double heading_kI = 0.0;
        public static double heading_kD = 0.0;

        // Lift PID (idek whats on this robot)
        public static double lift_kP = 0.0;
        public static double lift_kI = 0.0;
        public static double lift_kD = 0.0;
    }
}





