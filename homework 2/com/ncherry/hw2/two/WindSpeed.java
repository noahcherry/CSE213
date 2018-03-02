package com.ncherry.hw2.two;
/**
 * holds windspeed as measure of miles per hour
 * 
 * @author Noah Cherry
 * @version hw 1
 * @bugs None
 */
public class WindSpeed {
	private double mph;
	
	//getters
	public double getMph() {
		return this.mph;
	}
	
	//setters
	private void setMph(double value) {
		this.mph = value;
	}
	
	//constructors
	public WindSpeed(double value) {
		this.setMph(value);
	}
	
	//methods
	/**
	 * @param None.
	 * @return wind speed by measure of meters per second
	 */
	public double toMetersPerSecond() {
		return this.getMph() * 0.44704;
	}
	
	/**
	 * @return string of format "[value], miles per hour"
	 */
	public String toString() {
		return String.format("(%d, miles per hour)", this.getMph());
	}
}
