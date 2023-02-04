package first;

public class Entrypoint {
	
	public static void main(String[] args) {
		
		TeacherReference t= new TeacherReference();
		             Student s =t.generateStudent("Prachi",2200);
		             
		             s.printInfo();
		
	}

}
