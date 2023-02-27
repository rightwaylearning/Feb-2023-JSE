package student_Info;

public class Student {

	private String name;
	private int rollNumber;
	private int[] marks;
	private School school;
	private Address[] adr;

	public Student() {

	}

	public Student(String name, int rollNumber, School school, Address[] adr, int[] marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.school = school;
		this.adr = adr;
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Address[] getAdr() {
		return adr;
	}

	public void setAdr(Address[] adr) {
		this.adr = adr;
	}

}
