package CLA;

public class CommandLinArgs {

	public static void main(String[] args) {
		
		if(args.length==2) {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			
			System.out.println("sum is "+(n1+n2));
		}

	}

}
