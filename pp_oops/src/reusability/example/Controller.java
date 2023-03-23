package reusability.example;

public class Controller {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.doOpt(10, 20);
		
		Student2 s1 = new Student2();
		s1.doMyOpt(20, 30);
	}
}
 