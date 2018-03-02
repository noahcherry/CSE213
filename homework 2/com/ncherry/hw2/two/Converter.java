package com.ncherry.hw2.two;
import java.util.Scanner;
import com.ncherry.hw2.two.Temperature.Degrees;
/**
 * for testing temperature conversions
 * 
 * @author Noah Cherry
 * @version hw 1
 * @bugs None
 */
public class Converter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner numin = new Scanner(System.in);
		double value;	
		Temperature temp = new Temperature(0.0, Degrees.FARENHEIT);
		boolean test = true;


		System.out.println("Temperature Conversion Calculator");
		System.out.println("=================================");
		System.out.println("");
		System.out.println("Enter the temperature> ");
		
		value = numin.nextDouble();
		
		System.out.println("Enter the temperature unit [K/C/F]> ");
	
		while(test) {
			String unit = in.nextLine().toLowerCase();
			if(unit.equals("f")) {
				temp = new Temperature(value, Degrees.FARENHEIT);
				test = false;
			}
			else if(unit.equals("c")) {
				temp = new Temperature(value, Degrees.CELSIUS);
				test = false;
			}
			else if(unit.equals("k")) {
				temp = new Temperature(value, Degrees.KELVIN);
				test = false;
			}
			else {
				System.out.println("Invalid input!");
			}
		}

		test = true;
		
		System.out.println("Enter the desired unit [K/C/F]> ");
		while(test) {
			String unit = in.nextLine().toLowerCase();
			System.out.println("");
			if(unit.equals("f")) {
				System.out.println("Current Temperature: " +temp.getFarenheit()+" Degrees Farenheit");
				test = false;
			}
			else if(unit.equals("c")) {
				System.out.println("Current Temperature: " +temp.getCelsius()+" Degrees Celsius");
				test = false;
			}
			else if(unit.equals("k")) {
				System.out.println("Current Temperature: " +temp.getKelvin()+" Degrees Kelvin");
				test = false;
			}
			else {
				System.out.println("Invalid input!");
			}
		}
		
		in.close();
		numin.close();

	}

}
