/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  TalonSRX talonr1 = new TalonSRX(0); 
  TalonSRX talonl1 = new TalonSRX(1); 
  TalonSRX talonr2 = new TalonSRX(2); 
  TalonSRX talonl2 = new TalonSRX(3); // invert


  XboxController xbox = new XboxController(0);

  @Override
  public void robotInit() {
    talonl2.setInverted(true);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    double stick = xbox.getY(GenericHID.Hand.kLeft);
    talonl1.set(ControlMode.PercentOutput, stick);
    talonl2.set(ControlMode.PercentOutput, stick);
    talonr1.set(ControlMode.PercentOutput, stick);
    talonr2.set(ControlMode.PercentOutput, stick);
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
