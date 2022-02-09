package com.hcl.training.exercise6;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementApp {
	static String dbname = "hcl";
	static String url = "jdbc:mysql://localhost:3306/" + dbname;
	static Connection connection = null;

	public static void main(String[] args) {
		// Initialize System.in
		Scanner input = new Scanner(System.in);

		// Initialize Database
		DBConnection DB = new DBConnection();

		// Main Loop
		String userInput = "";
		mainMenu();
		while (!userInput.toLowerCase().equals("exit") || !userInput.toLowerCase().equals("6")) {
			System.out.print(">>> ");
			userInput = input.nextLine();
			if (userInput.toLowerCase().equals("1")) {
				// Fetch Employees
				ArrayList<Employee> employees = DB.getAllEmployees();
				// USING LAMBDA EXPRESSION TO DISPLAY EMPLOYEES
				employees.forEach((e) -> {
					System.out.println(e.toString());
				});
			}

			if (userInput.toLowerCase().equals("2")) {
				// Fetch Employees based on given condition
				System.out.println("Enter Filter Conditions ");
				System.out.print("Name:  ");
				String name = input.nextLine();
				System.out.print("DOB:  ");
				String dob = input.nextLine();
				System.out.print("AGE:  ");
				String age = input.nextLine();
				System.out.print("SALARY:  ");
				String salary = input.nextLine();

				ArrayList<Employee> employees = DB.getAllEmployees();
				Stream<Employee> stream = employees.stream().filter(e -> e.getEmployeeName().equals(name))
						.filter(e -> e.getEmployeeDOB().equals(dob))
						.filter(e -> e.getEmployeeAge() >= Integer.parseInt(age))
						.filter(e -> e.getEmployeeSalary() >= Float.parseFloat(salary))
						.map(e -> new Employee(e.getEmployeeID(), e.getEmployeeName(), e.getEmployeeDOB(),
								e.getEmployeeAge(), e.getEmployeeSalary()));

				// Display Using Stream
				stream.forEach(e -> System.out.println(e.toString()));
			}

			if (userInput.toLowerCase().equals("3")) {
				// Get User Employee Data
				System.out.println("Enter Employee Data ");
				System.out.print("Name:  ");
				String name = input.nextLine();
				System.out.print("DOB:  ");
				String dob = input.nextLine();
				System.out.print("AGE:  ");
				String age = input.nextLine();
				System.out.print("SALARY:  ");
				String salary = input.nextLine();

				// Add Employee to DB
				DB.addEmployee(name, dob, Integer.parseInt(age), Float.parseFloat(salary));
			}

			if (userInput.toLowerCase().equals("4")) {
				// Get User Employee Data
				System.out.println("Update Employee");
				System.out.print("Name:  ");
				String name = input.nextLine();
				System.out.print("Field [name, dob, age, salary]:  ");
				String field = input.nextLine();
				System.out.print("New Value:  ");
				String value = input.nextLine();

				// Update Employee in DB
				DB.updateEmployee(name, field, value);
			}

			if (userInput.toLowerCase().equals("5")) {
				// Get User Employee Data
				System.out.println("Delete Employee");
				System.out.print("Name:  ");
				String name = input.nextLine();

				// Remove Employee from DB
				DB.deleteEmployee(name);
			}

			System.out.println();
		}

	}

	public static void mainMenu() {
		System.out.println("\t EMPLOYEE MANAGEMENT APP\t\n");
		System.out.println("\t 1: Fetch All Employees\t");
		System.out.println("\t 2: Fetch Employee given a field/value \t");
		System.out.println("\t 3: Add Employee \t");
		System.out.println("\t 4: Update Employee \t");
		System.out.println("\t 5: Delete Employee \t");
		System.out.println("\t 6: exit \t");
	}

}
