package student_info;

public class Student {
public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentFullName() {
		return StudentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		StudentFullName = studentFullName;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public School getSchool() {
		return School;
	}

	public void setSchool(School school) {
		School = school;
	}

public Student(int rollNumber, String studentFullName, int[] marks, Address[] address, student_info.School school) {
		super();
		this.rollNumber = rollNumber;
		StudentFullName = studentFullName;
		this.marks = marks;
		this.address = address;
		School = school;
	}

private int rollNumber;
private String StudentFullName;
private int[]marks;
private Address[]address;
private School School;

public Student() {
	
}
}
