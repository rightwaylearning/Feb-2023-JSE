package parametarized_constroctor;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
	
		 s.setName("Rohini");
		s.setName("Rohini Rokade");
		s.setRollNumber(25);
		
		System.out.println(s.getName());
		System.out.println(s.getRollNumber()); 
		
		
		//..............................
		
		Student s1 = new Student("Rohini Rokade", 25);
		s1.setRollNumber(10);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
		
	}

}
