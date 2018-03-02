package com.ncherry.hw2.two;
/**
 * calculates wind chill temperature
 * 
 * @author Noah Cherry
 * @version hw 1
 * @bugs None
 */
public class WindChill {
	//getters
	public double getWindChill(Temperature t, WindSpeed w) {
		if(t.getFarenheit() >= 50.0 || w.getMph() < 3.0)
			return 0.0;
		return (35.74 + (0.6215 * t.getFarenheit()) - (35.75 * Math.pow(w.toMetersPerSecond(), 0.16)) + (4.275 * t.getCelsius() * Math.pow(w.getMph(), 0.16)));
	}
	public double getWindChillWatts(Temperature t, WindSpeed w) {
		if(t.getFarenheit() >= 50.0 || w.getMph() < 3.0)
			return 0.0;
		return (12.1452 + 11.6222 * Math.sqrt(w.toMetersPerSecond()) - 1.16222 * w.toMetersPerSecond()) * (33 - t.getCelsius());
	}
}
