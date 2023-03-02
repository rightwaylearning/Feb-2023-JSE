package student.info;

public class Student {
	int rollNumber;
	String name;
	int[] marks;
	School school;
	Address[] address;
	
	public Student(){}

	public Student(int rollNumber, String name, int[] marks, School school, Address[] address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.school = school;
		this.address = address;
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

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	
	
	

}
