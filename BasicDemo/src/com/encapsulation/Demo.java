package com.encapsulation;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setMarks(12);
		
		Student s2 = new Student(13, "zaid", 45);
		
		System.out.println(s1.getMarks());
		System.out.println(s2.getName());
		System.out.println("__________");
		s2.showDetails(23, "abc", 345);
	}

}
