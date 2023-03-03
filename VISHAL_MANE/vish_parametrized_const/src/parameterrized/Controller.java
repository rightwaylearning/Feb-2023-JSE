package parameterrized;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("vishal mane");
		s.setRollNumber(8);
		
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		
	}

}
