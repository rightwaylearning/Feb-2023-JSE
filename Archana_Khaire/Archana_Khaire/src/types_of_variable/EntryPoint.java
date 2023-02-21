package types_of_variable;

public class EntryPoint {
	public static void main(String[] args) {
		Student s = new Student();
		s.roolNumber = 1;
		s.name = "Archana";
		s.schoolName = "Bal vikash Mandar";
		
		Student s1 = new Student();
		s1.roolNumber = 2;
		s1.name = "Sharayu";
		Student.schoolName  = "New School";
		
		Student s2 = new Student();
		s2.roolNumber = 3;
		s2.name = "Aryan";
		
		System.out.println(s.name); // Archana
		System.out.println(s2.schoolName); // New school
		
	}
	
}
