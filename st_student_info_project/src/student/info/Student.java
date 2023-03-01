package student.info;

public class Student {

	private int rollNumber;
	private String studentFullName;
	private int[] marks;
	private Address[] address;
	private School school;

	public Student() {}
	 // default contructor

	// parameterised constructor

	public Student(int rollNumber, String studentFullName, int[] marks, Address[] address, School school) {
		super();
		this.rollNumber = rollNumber;
		this.studentFullName = studentFullName;
		this.marks = marks;
		this.address = address;
		this.school = school;
	}

	// generate getter and setter

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
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
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
