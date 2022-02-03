package com.hcl.training.exercise2;

public class Student {
	private int StudentID;
	private String StudentName;
	private int StudentMark;

	public Student(int id, String name) {
		// Init Student Object
		this.StudentID = id;
		this.StudentName = name;
		this.StudentMark = 0;
	}

	// Student ID Getter
	public int getStudentID() {
		return this.StudentID;
	}

	// Student Name Getter
	public String getStudentName() {
		return this.StudentName;
	}

	// Student Mark Getter
	public int getStudentMark() {
		return this.StudentMark;
	}

	// Student Name - Setter
	public void setStudentName(String name) {
		this.StudentName = name;
	}

	// Student Mark - Setter
	public void setStudentMark(int mark) {
		this.StudentMark = mark;
	}

}
