package com.hcl.training.exercise6;

public class Employee {
	private int ID = 0;
	private String name = "";
	private String dob = "";
	private int age = 0;
	private float salary = 0;
	
	public Employee(int id, String name, String dob, int age, float salary) {
		this.ID = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.salary = salary;
	}
	
	// Getters
		public int getEmployeeID() {
			return this.ID;
		}

		public String getEmployeeName() {
			return this.name;
		}
		
		public int getEmployeeAge() {
			return this.age;
		}

		public float getEmployeeSalary() {
			return this.salary;
		}
		
		public String getEmployeeDOB() {
			return this.dob;
		}

		// Setters
		public void setEmployeeName(String name) {
			this.name = name;
		}
		
		public void setEmployeeDOB(String dob) {
			this.dob = dob;
		}
		
		public void setEmployeeSalary(float salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return this.ID + " " + this.name + " " + this.dob + " " + this.age + " " + this.salary;
		}


}
