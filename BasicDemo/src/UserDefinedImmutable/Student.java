package UserDefinedImmutable;

//user defined immutable class in java

//The class must declared as final so that its child class can't be created
public final class Student { 
	
	//Data members should private so that direct access won't be available
	//Data members should be final so that we can't change the value of it after object creation
	private final int roll; 
	private final String name;
	
	//parameterized constructor for setting values
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	
	public int getStudentRoll() {
		return roll;
	}
	
	public String getStudentName() {
		return name;
	}
	
}
