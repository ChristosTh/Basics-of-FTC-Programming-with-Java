package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "ServoControl")
public class ServoControl extends OpMode {

    // Variable Declarations

    private Servo servo1;

    @Override
    public void init() {

        // Init

        // Getting hardware components

        servo1 = hardwareMap.get(Servo.class, "servo1");

    }

    @Override
    public void loop() {

        // Main Program

        servo1.setPosition(0.5); // Can be a value from 0-1
        servo1.setPosition(0);

    }

}