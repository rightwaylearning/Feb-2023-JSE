package student.info;

public class TeacherReference {
	
	Student generateStudent(String name , int num) {
		
		Student s = new Student();
		s.studentName = name;
		s.rollNumber = num;
		
		return s;
	}

}
