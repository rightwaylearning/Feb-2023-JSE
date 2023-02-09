package student.info;

public class EntryPoint {
	
	public static void main(String[]data) {
		
		TeacherReference t = new TeacherReference();
		
		Student s = t.generateStudent("priti",3);
		
		s.printInfo();
	}

}
