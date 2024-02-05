package Interfaces;

public interface InterfaceExample{
	
	abstract void vision();
	
//	default methods in interface
	default void knowYourVision() {
		System.out.println("may my presence destroy the darkness of this earth!");
	}
//	static method in interface
	static void goal() {
		System.out.println("Coader with creativity");
	}
	
public class InterfaceExampleImpl implements InterfaceExample{
	
	@Override
	public void vision() {
		// TODO Auto-generated method stub
		System.out.println("Today we will talk about vision");
		
	}
	
	public static void main(String[] args) {
		InterfaceExampleImpl ie = new InterfaceExampleImpl();
		
		ie.vision();
		ie.knowYourVision();
		InterfaceExample.goal();		
		
	}	
  }
}



