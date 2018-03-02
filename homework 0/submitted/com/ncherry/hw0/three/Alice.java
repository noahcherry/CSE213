package com.ncherry.hw0.three;

import java.io.*;

/**
 * takes alice.txt, outputs slice_in_mixed_case.txt.
 * 
 * @author Noah Cherry
 * @version hw 0, 3
 * @bugs None.
 */

public class Alice {

	public static void main(String[] args) throws IOException {
		int count = 1;
		//File file = new File("alice_in_mixed_case.txt");
		String fileOut = "alice_in_mixed_case.txt";
		String line;
		
		BufferedReader in = null;
		PrintWriter writer = null;
		try {
			in = new BufferedReader(new FileReader("alice.txt"));
			writer = new PrintWriter(fileOut);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(line = in.readLine(); line != null; line = in.readLine()) {
			if( "".equals(line.trim()) ) 
				writer.println("");
			else {
				if((count % 2) != 0)
					writer.println(line.toLowerCase());
				else
					writer.println(line.toUpperCase());
				count++;
			}

		}
				
	}

}
