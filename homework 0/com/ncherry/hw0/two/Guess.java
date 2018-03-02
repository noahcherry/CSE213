package com.ncherry.hw0.two;

import java.util.Scanner;

/**
 * Computer guesses number using binary search tree. User defines upper and lower bounds.
 * 
 * @author Noah
 * @version hw 0, 2
 * @bugs None.
 */

public class Guess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner numin = new Scanner(System.in);
		boolean correct = false;
		String hint = "";
		int count = 0;
		int guess = 0;
		
		System.out.println("Think of a number!");
		System.out.print("Lower bound: ");
		int lower = in.nextInt();
		System.out.print("Upper bound: ");
		int upper = in.nextInt();
			
		while(!correct) {
			guess = (lower + upper) / 2;
			System.out.print("Is it " + guess + "?  [lt/eq/gt]: ");
			hint = numin.nextLine();
			if(hint.toLowerCase().equals("lt"))
				upper = guess - 1;
			else if(hint.toLowerCase().equals("gt"))
				lower = guess + 1;
			else if(hint.toLowerCase().equals("eq"))
				correct = true;
			count++;
		}
		System.out.print("It took " + count + " guesses to find the number " + guess + "!");
		in.close();
		numin.close();
	}
}
