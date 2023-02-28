package parametrized.constructor;

public class Controller {

public static void main(String[] args) {
		
		Student s= new Student();
		s.setName("shital");
		s.setName("shital shirke");
		s.setRollNumber(23);
		
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		
		//----------------------------------
		
		Student s1 = new Student("shital shirke",23);
		s1.setRollNumber(26);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
		
	}

}
