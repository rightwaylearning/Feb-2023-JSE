package st.student.info;

public class EntryPoint {
    
	public static void main(String[] args) {
		
		TeacherReference t = new TeacherReference();
		Student s = t. generateStudent("Rahul",2);
		  s.printInfo();
	}
	
	
}
