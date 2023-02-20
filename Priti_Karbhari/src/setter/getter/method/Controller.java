package setter.getter.method;

public class Controller {
	public static void main (String[]args) {
		
		Student s = new Student();
		
		s.setRollNumber(37);
		s.setName("priti");
		
		
		int rollNumber = s.getRollNumber();
		String name = s.getName();
		
		

		System.out.println(rollNumber);
		System.out.println(name);
	}

}
