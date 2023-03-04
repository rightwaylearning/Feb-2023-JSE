package school.student.info;

public class Student {
	
	private String studentFullName;
	private Address[] address;
	private int rollNumber;
	private int[] marks;
	private School school;
	
	public Student() {
		
	}

	public Student(String studentFullName, Address[] address, int rollNumber, int[] marks, School school) {
		super();
		this.studentFullName = studentFullName;
		this.address = address;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.school = school;
	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
