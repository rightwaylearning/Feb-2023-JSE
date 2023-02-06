package kul.student.detais;

public class StudentDetails {
	public int rollNo;
	public String studentName;
	public String schoolName;
	public Address adr;
	public void printStudentInfo() {
		System.out.println(rollNo);
		System.out.println(studentName);
		System.out.println(schoolName);
		System.out.println(adr);
	}
}
