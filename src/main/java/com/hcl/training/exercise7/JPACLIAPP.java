package com.hcl.training.exercise7;

import java.util.Scanner;

public class JPACLIAPP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		int userInput = -1;
		while (userInput != 0) {
			mainMenu();
			userInput = input.nextInt();
			input.nextLine();
			
			switch (userInput) {
			case 1:
				// TODO - Add input checks
				System.out.print("First Name: ");
				String fname = input.nextLine();
				System.out.print("Last Name: ");
				String lname = input.nextLine();
				System.out.print("Email: ");
				String email = input.nextLine();
				
				manager.addStudent(fname, lname, email);
				break;
			case 2:
				manager.getAllStudents();
				break;
			case 3:
				System.out.print("Student ID: ");
				int id = input.nextInt();
				input.nextLine();
				manager.getStudent(id);
				break;
			case 4:
				System.out.print("Student ID: ");
				id = input.nextInt();
				input.nextLine();
				System.out.print("Name: ");
				lname = input.nextLine();
				manager.updateFirstName(id, lname);
				break;
			case 5:
				System.out.print("Student ID: ");
				id = input.nextInt();
				input.nextLine();
				manager.deleteStudent(id);
				break;
			default:
				manager.getAllStudents();
				break;
			}
		}

	}

	public static void mainMenu() {
		System.out.println("\n");
		System.out.println("\t STUDENT MANAGEMENT APP\t\n");
		System.out.println("\t 1: Add Student \t");
		System.out.println("\t 2: Fetch ALL Students\t");
		System.out.println("\t 3: Fetch Single Student\t");
		System.out.println("\t 4: Update Student \t");
		System.out.println("\t 5: Delete Student \t");
		System.out.println("\t 0: exit \t");
	}
}
