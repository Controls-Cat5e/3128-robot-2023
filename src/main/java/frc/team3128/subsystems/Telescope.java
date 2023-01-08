package frc.team3128.subsystems;

import com.ctre.phoenix.motorcontrol.ControlFrame;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Encoder;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team3128.common.utility.NAR_Shuffleboard;
// import static frc.team3128.Constants.TelescopeConstants.*; <--- made a new class for telescope consts
import frc.team3128.common.hardware.motorcontroller.MotorControllerConstants.*;
// import frc.team3128.common.hardware.motorcontroller.xxxx; 
// import static frc.team3128.common.hardware.motorcontroller.xxxx; <--- add motor name + add to hardware.motocontroller



/**
 * Telescope for windmill arm class
 */

public class Telescope extends SubsystemBase{
    
    private static Telescope instance;

    // private xxxx m_teleMotor;
    private Encoder m_teleEncoder;

    public Telescope() {

        configMotors();
        configEncoders();

    }

    public static synchronized Telescope getInstance() {
        if (instance == null)
            instance = new Telescope();
        return instance;
    }
    
    /**
     * Initializes motor needed for telelscope and sets up CAN frame periods
     */
    private void configMotors() {
        // m_teleMotor = new xxxx(TELE_MOTOR_ID) <---we need to figure out what motors we are using

        // m_hopper1.setNeutralMode(NeutralMode.x);

        // m_teleMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_1_General, x);
        // m_teleMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, x);
        // m_teleMotor.setControlFramePeriod(ControlFrame.Control_3_General, x);

    }

    /**
     * Initializes telescope encoder
     */
    private void configEncoders() {
        // m_teleEncoder = new Encoder(xx); 
    }

    /**
     * Data for Shuffleboard <-- worry about that later
     */
    public void initShuffleboard() {

    }

    @Override
    public void periodic(){

    }

    /**
     * Extends Telescope at regular power
     */
    public void extendTele() {
        // m_teleMotor.set(TELE_MOTOR_POWER); 
    }

    public void extendTele(double power) {
        // m_teleMotor.set(power); 
    }

    /**
     * Retracts telescope at regular power
     */
    public void retractTele() {
        // m_teleMotor.set(-TELE_MOTOR_POWER);
    }

    public void retractTele(double power) {
        // m_teleMotor.set(-power);
    }

    /**
     * Telescope goes into neutral position (sets power to 0)
     */
    public void stopTele() {
        // m_teleMotor.set(0);
    }

    public void resetTeleEncoder() {
        // m_teleEncoder.setEncoderPosition(0);
    }

}