package rwl.student.details;

public class EntryPoint {

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		
		s.rollNumber = 23;
		s.studentName = "Vishal";
		s.schoolName = "MG School";
		
		s.printStudentInfo();
		
	}
}
