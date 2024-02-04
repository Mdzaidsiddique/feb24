package com.revise;

public class Main {
	
	int x=10;

	public static void main(String[] args){

		Main obj1=new Main();
		obj1.x=50;
		System.out.println(obj1.x);
		
		Main obj2=obj1;
		System.out.println(obj2.x);
		
		Main obj3=new Main();
		System.out.println(obj3.x);
	}
}
