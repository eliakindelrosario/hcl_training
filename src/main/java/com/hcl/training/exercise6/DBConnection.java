package com.hcl.training.exercise6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBConnection {
	private String dbname = "hcl";
	private String url = "jdbc:mysql://localhost:3306/" + dbname;
	private Connection connection = null;

	public DBConnection() {
		// Get DB Credentials
		String db_username = System.getenv("SQLUSER");
		String db_password = System.getenv("SQLPASS");

		try {
			// Connect to DB
			connection = DriverManager.getConnection(url, db_username, db_password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return this.connection;
	}
	
//	UPDATE  EMPLOYEE
	public void addEmployee(String name, String dob, int age, float salary) {
		String query = "INSERT INTO employee (name, dob, age, salary) VALUES (?,?,?,?)";
		try {
			// Connect to DB
			Connection conn = this.getConnection();

			// Prepare query for execution
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, name);
            preparedStatement.setString(2, dob);
            preparedStatement.setInt(3, age);
            preparedStatement.setFloat(4, salary);
          
			// Execute query
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList getAllEmployees() {
		// Employee Container
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ResultSet rs = null;
		
		// Query
		String query = "SELECT * from employee";
		try {
			// Connect to DB
			Connection conn = this.getConnection();

			// Prepare query for execution
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			// Execute query and get the results
			rs = preparedStatement.executeQuery();
			
			// Add employees to container
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dob = rs.getString("dob");
				int age = rs.getInt("age");
				float salary = rs.getFloat("salary");
				employees.add(new Employee(id, name, dob, age, salary));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}
	
	public ArrayList getFilteredEmployees(String field, String value) {
		// Employee Container
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ResultSet rs = null;
		
		// Query
		String query = "SELECT * from employee where " + field + " = \"" + value +"\"";
		try {
			// Connect to DB
			Connection conn = this.getConnection();

			// Prepare query for execution
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			// Execute query and get the results
			rs = preparedStatement.executeQuery();
			
			// Add employees to container
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dob = rs.getString("dob");
				int age = rs.getInt("age");
				float salary = rs.getFloat("salary");
				employees.add(new Employee(id, name, dob, age, salary));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}
	

//	UPDATE  EMPLOYEE
	public void deleteEmployee(String name) {
		String query = "DELETE from employee where name = \"" + name +"\"";
		try {
			// Connect to DB
			Connection conn = this.getConnection();

			// Prepare query for execution
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			// Execute query
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

//	DELETE EMPLOYEE
	public void updateEmployee(String name, String field_to_update, String value_update) {
		String query = "UPDATE employee set " + field_to_update + " =  \"" + value_update + "\" where name = \"" + name +"\"";
		try {
			// Connect to DB
			Connection conn = this.getConnection();

			// Prepare query for execution
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			// Execute query
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
