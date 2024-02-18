package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "ContinuousServoControl")
public class ContinuousServoControl extends OpMode {

    // Variable Declarations

    private CRServo cServo;

    @Override
    public void init() {

        // Init
        cServo = hardwareMap.crservo.get("cServo");

        // Getting hardware components

    }

    @Override
    public void loop() {

        // Main Program
        cServo.setPower(1); // Use power like motors

    }

}