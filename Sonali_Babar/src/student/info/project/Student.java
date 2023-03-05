package student.info.project;

public class Student {
	private int rollNumber;
	private String studentName;
	private int[] marks;
	private Address[] address;
	private School school;

	public Student() {

	}

	public Student(int rollNumber, String studentName, Address[] address, int[] marks, School school) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
