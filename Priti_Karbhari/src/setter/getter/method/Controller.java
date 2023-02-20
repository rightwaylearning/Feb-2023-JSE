package setter.getter.method;

public class Controller {
	public static void main (String[]args) {
		
		Student s = new Student();
		
		s.setName("priti");
		s.setRollNumber(37);
		
		int rollNumber = s.getRollNumber();
		String name = s.getName();
		

		System.out.println(rollNumber);
		System.out.println(name);
	}

}
