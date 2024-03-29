package VarArgs;

public class VariableArguments {
	
//	var args: Pass zero or more arguments to a method 
	
	public void display() {
		System.out.println("inside display");
	}

	public void display(String... values) {
		System.out.println("inside display String values[]");
	}
	
//	var-args must be the last argument
	public void display(int a, int... values) {
		System.out.println("inside display for int a and values[]");
	}
	
	public void display(int a[]) {
		System.out.println(a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.display();
		va.display(1,2,3,4);
		va.display("abc", "def", "ghi");
		int[] a= {1,2,3,4};
		va.display( a);
	}
}
