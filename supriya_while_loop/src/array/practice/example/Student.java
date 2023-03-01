package array.practice.example;

public class Student {

	private int rollNumber;
	private String sName;

	public Student() {
		
	}

	public Student(int rollNumber, String sName) {
		super();
		this.rollNumber = rollNumber;
		this.sName = sName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}
