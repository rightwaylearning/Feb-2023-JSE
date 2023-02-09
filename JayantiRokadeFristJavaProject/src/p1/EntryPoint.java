package p1;

public class EntryPoint {
	
	public static void main(String[] args) {
		TeacherReference t1=new TeacherReference();
		Student s=t1.generateStudent(11,"pranali", 70, "Wagholi");
		s.printInfo();
	}

}
