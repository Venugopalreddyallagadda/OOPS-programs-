package com.ojas.mar23;

public class Student1 {
	int studentId;
	String sName;
	double examFee;

	Student1() {

	}

	public Student1(int studentId, String sName, double examFee) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.examFee = examFee;
	}

	public String displayDetails() {
		return "Student1 [studentId=" + studentId + ", sName=" + sName + ", examFee=" + examFee + "]";

	}

	public double payFee(double amount) {
		return examFee - amount;
	  

	}

	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}

}
