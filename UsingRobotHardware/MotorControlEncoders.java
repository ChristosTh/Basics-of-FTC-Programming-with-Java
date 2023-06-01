package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "MotorControlEncoders")
public class MotorControlEncoders extends OpMode {

    // Variable Declarations
    private DcMotor motor;

    @Override
    public void init() {

        // Init
        motor = hardwareMap.get(DcMotor.class, "motor"); // getting the component
        motor.setDirection(DcMotorSimple.Direction.FORWARD); // setting the direction of rotation

        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER); // resetting the encoders so they are ready to be used

        // Getting hardware components

    }

    @Override
    public void loop() {

        // Main Program
        motor.setTargetPosition(800); // setting the target position that motor will move to
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION); // getting the motors ready to move to that position
        motor.setPower(0.8); // setting the power that the motor will rotate

    }

}
