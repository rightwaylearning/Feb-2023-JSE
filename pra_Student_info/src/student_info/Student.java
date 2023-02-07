package student_info;

public class Student {
	
	public int rollNumber;
	public String StudentName;
	public String SchoolName;
	public int studentAge;
	public String studentDivision;
    Address adr;
    
    public void studentInfo() {
    	System.out.println(rollNumber);
    	System.out.println(StudentName);
    	System.out.println(SchoolName);
    	System.out.println(studentAge);
    	System.out.println(studentDivision);
    }
    public void studentAddress() {
    	System.out.println(adr.line1);
    	System.out.println(adr.line2);
    	System.out.println(adr.pincode);
    }
}
