package student_information;

public class Student {
	
	private int rollNumber;
	private String studentFirstName;
	private String studentLastName;
	private int[] marks;
	private Address[] address;
	private School school;
	
	//default constructor
	public Student() {
		
	}

	//parameterized constructor
	public Student(int rollNumber, String studentFirstName, String studentLastName, int[] marks, Address[] address, School school) {
		this.rollNumber=rollNumber;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.marks = marks;
		this.address = address;
		this.school = school;
	
	}

	//getters
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getStudentFirstName() {
		return studentFirstName;
	}
	
	public String getStudentLastName() {
		return studentLastName;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public Address[] getAddress() {
		return address;
	}
	
	public School getSchool() {
		return school;
	}
	
	//setters
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	
	public void SetStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void setAddress(Address[] address) {
		this.address= address;
	}
	
	public void setSchool(School school) {
		this.school= school;
	}
	
	
	
	
	
}
