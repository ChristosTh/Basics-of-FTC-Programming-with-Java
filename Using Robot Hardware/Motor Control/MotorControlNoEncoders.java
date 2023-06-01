package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "MotorControlNoEncoders")
public class MotorControlNoEncoders extends OpMode {

    // Variable Declarations
    private DcMotor motor;

    @Override
    public void init() {

        // Init
        motor = hardwareMap.get(DcMotor.class, "motor"); // getting the component
        motor.setDirection(DcMotorSimple.Direction.FORWARD); // setting the direction of rotation

        // Getting hardware components

    }

    @Override
    public void loop() {

        // Main Program
        motor.setPower(0.8); // setting the power that the motor will rotate

    }

}
