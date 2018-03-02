package com.ncherry.hw2.two;
/**
 * stores representation of temperature in Kelvin, Celsius, Farenheit.
 * 
 * @author Noah Cherry
 * @version hw 2
 * @bugs None
 */
public class Temperature extends WindChill {
	private double kelvin;
	private double celsius;
	private double farnheit;
	private Degrees type;
	
	public enum Degrees { 
		KELVIN, CELSIUS, FARENHEIT
	}
	
	//getters
	public double getKelvin() {
		return this.kelvin;
	}
	
	public double getCelsius() {
		return this.celsius;
	}
	
	public double getFarenheit() {
		return this.farnheit;
	}
	
	public Degrees getType() {
		return this.type;
	}
	
	//setters
	public void setKelvin(double k) {
		this.kelvin = k;
		this.celsius = k + 273.15;
		this.farnheit = 1.8 * this.celsius + 32;
	}
	
	public void setCelsius(double c) {
		this.celsius = c;
		this.kelvin = this.celsius - 273.15;
		this.farnheit = 1.8 * this.celsius + 32;
	}
	
	public void setFarenheit(double f) {
		this.farnheit = f;
		this.celsius = (5.0/9.0) * (this.farnheit - 32);
		this.kelvin = this.celsius - 273.15;
	}
	
	public void setType(Degrees type) {
		this.type = type;
	}
	
	//constructors
	
	public Temperature(double value, Degrees type) {
		if(type == Degrees.KELVIN)
			kelvinInstance(value);
		if(type == Degrees.CELSIUS)
			celsiusInstance(value);
		if(type == Degrees.FARENHEIT)
			farenheitInstance(value);
	}
	
	private void kelvinInstance(double value) {
		this.setKelvin(value);
	}
	
	private void celsiusInstance(double value) {
		this.setCelsius(value);
	}
	
	private void farenheitInstance(double value) {
		this.setFarenheit(value);
	}	
	
	//methods
	/**
	 * returns string in form of "[temp] [unit]"
	 * @param None.
	 */
	public String toString() {
		if(type == Degrees.KELVIN)
			return String.format("%.2f K", this.getKelvin());
		if(type == Degrees.CELSIUS)
			return String.format("%.2f C", this.getCelsius());
		else
			return String.format("%.2f F", this.getFarenheit());
		
	}
	
}
