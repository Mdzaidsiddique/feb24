package EarlyAndLateBinding;

public class EarlyBinding {
	
	private void early() {
		System.out.println("When Type of object detected at compile time is known as early binding");
		System.out.println("It is also known as static binding");
		System.out.println("Private, final, static methods are early bindings");
	}
	
	public static void main(String[] args) {
		EarlyBinding eb = new EarlyBinding();
		
		eb.early(); //early binding
	}

}
