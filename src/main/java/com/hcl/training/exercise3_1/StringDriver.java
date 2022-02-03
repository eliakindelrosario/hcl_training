package com.hcl.training.exercise3_1;

import java.util.Arrays;
import java.util.Scanner;

public class StringDriver {

	public static void main(String[] args) throws StringToLong {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a name: ");
		String name = input.nextLine();

		// Terminate System.in - no longer needed after this
		input.close();

		// Check Length
		if (name.length() > 15) {
			throw new StringToLong();
		}

		// Split Full Name
		String[] nameList = name.split(" ");

		// Display to console
		System.out.println("Original String: " + name);
		System.out.println("Decomposed String : " + Arrays.toString(nameList));
		System.out.println("\nTentative Result");
		System.out.println("\tFirst Name: " + nameList[0]);
		System.out.println("\tMiddle Name: " + nameList[1]);
		System.out.println("\tLast Name: " + nameList[2]);

	}

}
