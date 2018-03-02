package com.ncherry.hw0.one;

import java.lang.System.*;

/**
 * print numbers 1 to 100. if number is a multiple of 3 print Fizz.
 * if number is a multiple of 5 print Buzz.
 *
 * @author Noah Cherry
 * @version hw 0, #1
 * @bugs None
 */

public class FizzBuzz {

	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 100; i++) {
			if((i % 3) == 0)
				System.out.print("Fizz");
			if((i % 5) == 0)
				System.out.print("Buzz");	
			if((i % 3) != 0 && (i % 5) != 0)
				System.out.print(i);
			System.out.println("");
		}
	}
}

