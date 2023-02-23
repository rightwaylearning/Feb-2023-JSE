package constructor;

public class Parmeterized {
	String name;
	int rollNumber;
	
 public Parmeterized(){} // zero parameter constructor
 
 Parmeterized(String name, int rollNumber){ // parameterized constructor
		this.name=name;
		this.rollNumber=rollNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
}
