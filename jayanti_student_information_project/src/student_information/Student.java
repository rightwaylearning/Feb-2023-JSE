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
	
	
	
	
}
