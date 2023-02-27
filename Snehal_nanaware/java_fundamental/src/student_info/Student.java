package student_info;

public class Student {
	
	private String Name;
    private  School School;
	private int rollNo;
	private int[]marks;
	private  Address[] adr;
	
	public Student() {
		
	}

	public Student(String name, int rollNumber, School school, Address[] adr, int[] marks) {
		super();
		this.Name = Name;
		this.rollNo = rollNo;
		this.School = School;
		this.adr = adr;
		this.marks = marks;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public School getSchool() {
		return School;
	}

	public void setSchool(School school) {
		School = school;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public Address[] getAdr() {
		return adr;
	}

	public void setAdr(Address[] adr) {
		this.adr = adr;
	}
	
}
