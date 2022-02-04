package com.hcl.training.aside;

public class CSVRow {
	public String loginEmail;
	public String identifier;
	public String oneTimePassword;
	public String recoveryCode;
	public String firstname;
	public String lastname;
	public String department;
	public String location;

	public CSVRow(String loginEmail, String identifier, String oneTimePassword, String recoveryCode, String firstname,
			String lastname, String department, String location) {
		this.loginEmail = loginEmail;
		this.identifier = identifier;
		this.oneTimePassword = oneTimePassword;
		this.recoveryCode = recoveryCode;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.location = location;
	}

}
