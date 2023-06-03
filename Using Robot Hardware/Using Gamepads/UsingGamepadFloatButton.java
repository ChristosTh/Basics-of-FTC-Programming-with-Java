package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "UsingGamepadFloatButton")
public class UsingGamepadFloatButton extends OpMode {

    // Variable Declarations
    private DcMotor motor;
    private double motorPower; // to store the decimal number that we will get from the gamepad

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
        motorPower = gamepad1.left_stick_y; // get a value from -1 to 1 and stores it in the variable
        motor.setPower(motorPower); // sets the value as the parameter of the procedure to move the motor with the appropriate power declared by the gamepad left stick



    }

}
