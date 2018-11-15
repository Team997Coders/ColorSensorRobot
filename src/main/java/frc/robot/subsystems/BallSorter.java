/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.team997.first.wpilibj.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class BallSorter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  TCS34725_I2C colorSensor = null;

  public static BallSorter Create() {
    return new BallSorter(new TCS34725_I2C(I2C.Port.kOnboard, TCS34725_I2C.TCS34725_INTEGRATIONTIME_154MS, TCS34725_I2C.TCS34725_GAIN_16X));
  }

  public BallSorter(TCS34725_I2C colorSensor) {
    this.colorSensor = colorSensor;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
