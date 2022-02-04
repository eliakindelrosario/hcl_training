package com.hcl.training.exercise5_1;

public class Doctor {
	private int DoctorID;
	private String DoctorName;
	private String Specialty;

	public Doctor(int id, String name, String specialty) {
		this.DoctorID = id;
		this.DoctorName = name;
		this.Specialty = specialty;
	}

	// Getters
	public int getDoctorID() {
		return this.DoctorID;
	}

	public String getDoctorName() {
		return this.DoctorName;
	}

	public String getSpecialty() {
		return this.Specialty;
	}

	// Setters
	public void setDoctorName(String name) {
		this.DoctorName = name;
	}

	public void setSpecialty(String spec) {
		this.Specialty = spec;
	}

	@Override
	public String toString() {
		return this.DoctorID + " " + this.DoctorName + " " + this.Specialty;
	}

}
