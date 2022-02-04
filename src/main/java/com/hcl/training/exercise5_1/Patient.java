package com.hcl.training.exercise5_1;

import java.util.Comparator;

public class Patient implements Comparable<Patient> {
	private int PatientID;
	private String PatientName;
	private int PatientAge;

	public Patient(int id, String name, int age) {
		this.PatientID = id;
		this.PatientName = name;
		this.PatientAge = age;
	}

	// Getters
	public int getPatientID() {
		return this.PatientID;
	}

	public String getPatientName() {
		return this.PatientName;
	}

	public int getPatientAge() {
		return this.PatientAge;
	}

	// Setters
	public void setPatientName(String name) {
		this.PatientName = name;
	}

	public void setPatientAge(int age) {
		this.PatientAge = age;
	}

	public int compareTo(Patient p) {
		if (this.PatientAge == p.PatientAge) {
			return 0;
		} else if (this.PatientAge < p.PatientAge) {
			return 1;
		} else {
			return -1;
		}
	}

	// Comparator
	public static Comparator<Patient> ComPatientID = new Comparator<Patient>() {
		public int compare(Patient p1, Patient p2) {
			if (p1.PatientID == p2.PatientID) {
				return 0;
			} else if (p1.PatientID < p2.PatientID) {
				return 1;
			} else {
				return -1;
			}
		}
	};

	public static Comparator<Patient> ComPatientName = new Comparator<Patient>() {
		public int compare(Patient p1, Patient p2) {
			//	Descending
			return p2.getPatientName().toLowerCase().compareTo(p1.getPatientName().toLowerCase());
		}
	};

	@Override
	public String toString() {
		return this.PatientID + " " + this.PatientName + " " + this.PatientAge;
	}
}
