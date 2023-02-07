package student_static;

public class Entry_Student {
	
	public static void main(String[] args) {
		
		Student s = new Student ();
		s.name = "virat kohli";
		s.rollNumber = 18;
		
		s.schoolName = "s.k.d.v school";
		
		Student s1 = new Student ();
		s1.name = "Rohit Sharma ";
		s1.rollNumber = 45;
		
		
		Student s2 = new Student ();
		s2.name = "Shubhman Gill";
		s2.rollNumber= 8;
		
		s.Admission();
		s1.Admission();
		s2.Admission();
	}

}
