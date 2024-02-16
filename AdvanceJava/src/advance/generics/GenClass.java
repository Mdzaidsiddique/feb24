package advance.generics;

public class GenClass<T> {
	
	T ob;
	
	public GenClass(T ob){ 
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("The Type of ob is : "+ob.getClass().getName());
	}
	
	public T getObj(){
		return ob;
	}

}
