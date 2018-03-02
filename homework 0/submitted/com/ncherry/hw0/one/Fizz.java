package com.ncherry.hw0.one;

/**
 * Prints numbers 1-100. multiples of three print Fizz, multiples of 5 print Buzz. Both print FizzBuzz.
 * 
 * @author Noah Cherry
 * @version hw 0, 1
 * @bugs None
 */
public class Fizz {

	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 100; i++) {
			if((i % 3) == 0)
				System.out.print("Fizz");
			if((i % 5) == 0)
				System.out.print("Buzz");	
			if((i % 3) != 0 && (i % 4) != 0 && (i % 5) != 0)
				System.out.print(i);
			System.out.println("");
		}

	}

}
