package com.ojas.mar23;

public class Hosteller extends Student1 {

	double hostelFee;

	public Hosteller() {
		super();
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", sName=" + sName + ", examFee="
				+ examFee + "]";
	}

	public Hosteller(int studentId, String sName, double examFee, double hostelFee) {
		super(studentId, sName, examFee);
		this.hostelFee = hostelFee;
	
	}

	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", sName=" + sName + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amount) {
		return hostelFee + examFee - amount;

	}

}
