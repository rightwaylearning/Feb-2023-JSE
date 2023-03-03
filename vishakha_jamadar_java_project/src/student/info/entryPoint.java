package student.info;

public class entryPoint {
public static void main(String[] args) {
	inputOutput o=new inputOutput();
	
	Student s =new Student();
	s.setStudentFullName("vishakha");
	s.setRollNumber(20);
	s.setMarks(o.getMarks());
	s.setSchool(o.getSchoolInfo());
	
	
}
}
