package practice_04;

public class Entrypoint {
	
	public static void main(String[] args) {
		
		TeacherReferance t= new TeacherReferance();
		Student s=t.StudentgenrateStudent(1,"Vishakha",12);
		s.printInfo();
	}

}
