package com.ojas.mar23;

abstract class Student {
	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;
	
	
	Student() {
		
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	public abstract double getPercentage(); 
	
	static int  getTotalNoOfStudents() {
		return totalNoOfStudents;
		
	}

}
