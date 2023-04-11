package array_example;

public class Student {
	
	private int rollNumber;
	private String name;
	private double mark;
	
	public Student() {
		
	}

	public Student(int rollNumber, String name, double mark) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark = mark;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	
	 

}
