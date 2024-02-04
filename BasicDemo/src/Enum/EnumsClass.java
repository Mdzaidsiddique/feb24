package Enum;

public class EnumsClass {
	
	enum Colour {
		RED,
		GREEN,
		BLUE;
	}
	
	public static void main(String[] args) {
		EnumsClass ec = new EnumsClass();
		
		Colour clr[] = Colour.values();
		System.out.println(clr);
		
		for(Colour c:clr) {
			System.out.println(c.ordinal());
		}
	}

}
