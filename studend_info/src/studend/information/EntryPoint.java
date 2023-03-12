package studend.information;

public class EntryPoint {
	public static void main(String[] args) {
		Student s = new Student();
		s.rollNumber = 20;
		s.studentName = "sachin";
		s.schoolName = "vvmk";
		
		s.printStudentInfo();
	}

}
