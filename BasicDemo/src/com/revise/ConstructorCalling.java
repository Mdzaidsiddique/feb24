package com.revise;

public class ConstructorCalling {
	
	ConstructorCalling(){
		this(1);
		System.out.println("inside zero args cnstr");
	}
	
	ConstructorCalling(int x){
		this(4,3);
		System.out.println("Indside 2 args constr");
	}
	
	ConstructorCalling(int a, int b){
		this("zaid");
		System.out.println("inside string arg cnstr");
		
	}
	ConstructorCalling(String s){
//		this();
		System.out.println("contrurctr");
	}
	
	public static void main(String[] args) {
		ConstructorCalling cc = new ConstructorCalling("a");
		ConstructorCalling cc1 = new ConstructorCalling();
//		cc(45);
	}

}
