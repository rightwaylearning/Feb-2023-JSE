package student.details;

public class EntrypointPoint {
	
	public static void main(String[]data) {
		
		StudentDetails s = new StudentDetails();
		
		s.rollNumber = 37;
		s.studentName = "Priti";
	    s.schoolName = "LBSV school";
	    
	    s.printStudentInfo();
	    
	}

}
