package student_info;

public class Student {
	
	private int rollNumber;
	private String name;
	private Address[] address;
	private int[] marks;
	private School school;
	
	 public Student() {
		 
	 }

	public Student(int rollNumber, String name, Address[] address, int[] marks, School school) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.marks = marks;
		this.school = school;
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

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	 
	 

}
