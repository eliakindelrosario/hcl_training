package com.hcl.training.exercise5_1;

import java.util.Comparator;

public class Doctor implements Comparable<Doctor> {
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

	public int compareTo(Doctor p) {
		return p.DoctorName.toLowerCase().compareTo(this.DoctorName.toLowerCase());
	}
	
	// Comparator
		public static Comparator<Doctor> ComDoctorID = new Comparator<Doctor>() {
			public int compare(Doctor p1, Doctor p2) {
				if (p1.DoctorID == p2.DoctorID) {
					return 0;
				} else if (p1.DoctorID < p2.DoctorID) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		public static Comparator<Doctor> ComSpecialty = new Comparator<Doctor>() {
			public int compare(Doctor p1, Doctor p2) {
				return p2.getSpecialty().toLowerCase().compareTo(p1.getSpecialty().toLowerCase());
			}
		};

	@Override
	public String toString() {
		return this.DoctorID + " " + this.DoctorName + " " + this.Specialty;
	}

}
