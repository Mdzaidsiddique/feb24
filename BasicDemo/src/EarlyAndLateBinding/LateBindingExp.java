package EarlyAndLateBinding;

class LateBindingExp extends LateBinding{
	
	void definition() {
		System.out.println("when object type determined at runtime");
		System.out.println("Dynamic Binding");
	}
	
	public static void main(String[] args) {
		LateBinding lb = new LateBindingExp();
		lb.definition();
	}
}