package student;

public class Entrypoint {
	public static void main(String[] args) {
		TeacherReference t=new TeacherReference();
                Student s=t.generateStudent(1,"supriya","kauthale");
                		s.PrintInfo();
		
	}

}
