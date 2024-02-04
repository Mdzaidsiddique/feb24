package com.revise;

public class Pojo {
//	Plain old java object
//	class should be public
//	all members should be private
//	for each field--> getter and setter methods should be there
//	must have zero arg constructor
//	may have parameterized constructor
	
	private int x;
	private int y;
	private String s;
	
	public Pojo(){
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public void showDetails() {
		System.out.println(x+" "+y+" "+s);
	}
	

}
