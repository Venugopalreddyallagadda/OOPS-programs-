package com.ojas.mar23;

public class DayScholar extends Student1 {

	double transportFee;

	public DayScholar() {
		super();
	}


	public DayScholar(int studentId, String sName, double examFee, double transportFee) {
		super(studentId, sName, examFee);
		this.transportFee = transportFee;
		
	}

	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", sName=" + sName
				+ ", examFee=" + examFee + "]";

	}

	public double payFee(double amount) {
		return transportFee+examFee - amount;

	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", sName=" + sName
				+ ", examFee=" + examFee + "]";
	}

}
