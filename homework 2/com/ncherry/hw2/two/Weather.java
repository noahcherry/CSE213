package com.ncherry.hw2.two;

import java.util.Scanner;

import com.ncherry.hw2.two.Temperature.Degrees;
/**
 * driver program. uses a scanner to take user input.
 * 
 * @author Noah Cherry
 * @version hw 2
 * @bugs None
 */
public class Weather {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner numin = new Scanner(System.in);
		WindSpeed w;
		Temperature t;
		Degrees type = null;
		double temp;
		boolean test = true;
		
		System.out.println("Wind Chill Frostbite Clock");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Enter the temperature> ");
		
		temp = numin.nextDouble();
		
		System.out.println("Enter the temperature unit [K/C/F]> ");
		
		while(test) {
			String unit = in.nextLine().toLowerCase();
			if(unit.equals("f")) {
				type = Degrees.FARENHEIT;
				test = false;
			}
			else if(unit.equals("c")) {
				type = Degrees.CELSIUS;
				test = false;
			}
			else if(unit.equals("k")) {
				type = Degrees.KELVIN;
				test = false;
			}
			else {
				System.out.println("Invalid input!");
			}
		}
		
		t = new Temperature(temp, type);

		test = true;
		System.out.println("Enter the wind speed (mph)> ");
		w = new WindSpeed(numin.nextDouble());
		
		System.out.println("Wind Chill Temperature: "+ t.getWindChill(t, w) +" Degrees Farenheit");
		System.out.println("or in Watts per meter square the wind chill is: "+ t.getWindChillWatts(t, w) +" watts");

		in.close();
		numin.close();

	}
}
