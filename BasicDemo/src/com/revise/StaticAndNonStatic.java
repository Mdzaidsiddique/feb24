package com.revise;

public class StaticAndNonStatic {
	
	static int x;
	int y;
	
	public static void main(String[] args){
		
		StaticAndNonStatic obj1 = new StaticAndNonStatic();
		obj1.x=10;
		obj1.y=20;
	
		System.out.println(obj1.x); //10
		System.out.println(obj1.y); //20
		
		StaticAndNonStatic obj2 = new StaticAndNonStatic();
		obj2.x=50;
		obj2.y=80;

		System.out.println(obj1.x); //50
		System.out.println(obj1.y); //20

		System.out.println(obj2.x); //50
		System.out.println(obj2.y); //80
			
	}

}
