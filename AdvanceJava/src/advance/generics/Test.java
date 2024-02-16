package advance.generics;

public class Test{

	public static void main(String[] args) {
		
		GenClass<String> gc1 = new GenClass<String>("alif");
		gc1.show();
		gc1.getObj();
		
		GenClass<Integer> gc2 = new GenClass<Integer>(10);
		gc2.show();
		gc2.getObj();
		
		GenClass<Double> gc3 = new GenClass<Double>(10.5);
		gc3.show();
		gc3.getObj();
		
		GenClass<Student> gc4 = new GenClass<Student>(new Student(45,"zaid"));
		gc4.show();
		gc4.getObj();
		gc4.toString();
		
//		Unbounded Type
		UnBoundedType<Integer> ub1 = new UnBoundedType<Integer>();
		
//		Bounded Type
		BoundedType<Integer> b1 = new BoundedType<Integer>();
		BoundedType<Double> b2 = new BoundedType<Double>();
		BoundedType<Number> b3 = new BoundedType<Number>();
//		BoundedType<Object> b4 = new BoundedType<Object>(); we can pass only >= Number Class
	}
	

}
