package org.usfirst.frc330.commands.drivecommands;

import org.usfirst.frc330.wpilibj.PIDGains;

/**
 * @deprecated use PIDGains instead.
 */
@Deprecated
public class DrivePIDGains extends PIDGains{
	
	/**
	 *  Construct a DrivePIDGains object to use with DriveCommands.
	 *   
	 *   maxOutput, maxOutputStep, and minStartOutput are used like the drawing below.  
	 * <pre>
	 *   _ maxOutput
	 *  /
	 * /  maxOutputStep
	 * |  minStartOutput
	 * </pre>
	 * 
	 * 
	 * @param p the proportional coefficient
	 * @param i the integral coefficient
	 * @param d the derivative coefficient
	 * @param f the feed forward coefficient
	 * @param maxOutput the largest value to output (0 to 1.0)
	 * @param maxOutputStep the value to ramp up each time step (max 1.0)
	 * @param minStartOutput The value to start ramp up from
	 * @param name The name to use to use when logging
	 */
	public DrivePIDGains(double p, double i, double d, double f, double maxOutput, double maxOutputStep, double minStartOutput, String name) {
		super(p,i,d,f,maxOutput, maxOutputStep, minStartOutput, name);
	}

}