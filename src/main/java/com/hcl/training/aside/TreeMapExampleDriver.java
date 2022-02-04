package com.hcl.training.aside;

import java.io.BufferedReader;
import java.io.FileReader;

public class TreeMapExampleDriver {

	public static void main(String[] args) {
		String file = "C:\\Users\\SageBlue\\Downloads\\email-password-recovery-code.csv";
		BufferedReader reader = null;
		String line = "";
		
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				String[] row = line.split(";");
				// console log each row elements on the same line
				for (String index : row) {
					System.out.printf("%s |", index);
				}
				System.out.println(); // console log new line
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close buffer reader gracefully
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
