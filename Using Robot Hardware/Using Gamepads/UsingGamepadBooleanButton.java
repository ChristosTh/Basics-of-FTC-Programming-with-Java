package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "UsingGamepadBooleanButton")
public class UsingGamepadBooleanButton extends OpMode {

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

        if(gamepad1.a) {
            motor.setPower(0);  // while the button a is pressed (true condition) the motor will have a power of 1 (max)
        } else {
            motor.setPower(0); // if the button a is not pressed (false condition) the motor will have a power of 0 (not moving)
        }

    }

}
