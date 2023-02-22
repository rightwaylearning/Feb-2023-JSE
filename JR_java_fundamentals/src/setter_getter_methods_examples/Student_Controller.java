package setter_getter_methods_examples;

public class Student_Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setRollNumber(15);
		s.setName("Aarohi");
		
		int rollNumber = s.getRollNumber();
		
		System.out.println(rollNumber);
		
		String name = s.getName();
		System.out.println(name);
		
		
		
	}

}
