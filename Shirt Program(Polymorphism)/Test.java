package com.ojas.mar23;

public class Test {

	public static void main(String[] args) {
	ShirtMaterial s = ShirtMaterial.Cotton;
	 Shirt t = new Shirt(16.05f,42,""+s);
	System.out.println( t.displayDetails());
	}

}
