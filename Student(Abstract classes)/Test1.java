package com.ojas.mar23;

public class Test1 {
	public static void main(String[] args) {
		Student s = new ScienceStudent(40,80,10);
		
		System.out.println(s.getPercentage());
		
		Student s1 = new HistoryStudent(20,50);
		System.out.println(s1.getPercentage());
		
		//System.out.println(s1.getTotalNoOfStudents());
		
	}

}
