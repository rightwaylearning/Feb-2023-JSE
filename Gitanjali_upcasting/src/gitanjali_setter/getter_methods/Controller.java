package gitanjali_setter.getter_methods;

public class Controller {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Shivansh");
		s.setrollNumber(24);
		String name = s.getName();
		int rollNumber = s.getrollNumber();
		System.out.println(name);
		System.out.println(rollNumber);
	}
}
