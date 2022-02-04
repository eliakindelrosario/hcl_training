package com.hcl.training.exercise5_1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();

		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 40);
			patients.add(new Patient(i, "Patient " + (i+2), ran));
		}

		for (int i = 0; i < 5; i++) {
			doctors.add(new Doctor(i, "Doctor " + (i+2), "Specialty " + (i+5)));
		}

		// sort patients based on age
		System.out.println("Sorting Patient by Age:");
		Collections.sort(patients);
		for (Patient p : patients) {
            System.out.println("\t"+p);
        }
		System.out.println();
		
		// sort patients based on id
		System.out.println("Sorting Patient by ID:");
		Collections.sort(patients, Patient.ComPatientID);
		for (Patient p : patients) {
            System.out.println("\t"+p);
        }
		System.out.println();
		
		// sort patients based on name
		System.out.println("Sorting Patient by Name:");
		Collections.sort(patients, Patient.ComPatientName);
		for (Patient p : patients) {
            System.out.println("\t"+p);
        }

	}

}
