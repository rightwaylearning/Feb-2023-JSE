package student.info;

public class Student {

	private int rollNo;
    private String studentName;
    private Address[] address;
  private int[] marks;
    private School school;
    
    
    
    public Student(int rollNo, String studentName, Address[] address, int[] marks, School school) {
	
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.address = address;
		this.marks = marks;
		this.school = school;
	}

     Student(){}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
