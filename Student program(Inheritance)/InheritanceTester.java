package com.ojas.mar23;

public class InheritanceTester {

	public static void main(String[] args) {
		Student1 s = new DayScholar(1,"venu",400,200);
		System.out.println(s.displayDetails());
		
		System.out.println(s.payFee(1000));
		
		
		Student1 s2 = new Hosteller(2, "gopal",300,200);
		System.out.println(s2.displayDetails());
		
		System.out.println(s2.payFee(2000));

	}

}
