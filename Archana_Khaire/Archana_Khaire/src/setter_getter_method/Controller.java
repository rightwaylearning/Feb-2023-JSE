package setter_getter_method;

public class Controller {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("Aryan");
		e.setSalary(87000.25);
		
		int id = e.getId();
		
		System.out.println(id);
		
		String name = e.getName();
		
		System.out.println(name);
		
		double salary = e.getSalary();
		System.out.println(salary);
		
		Student s = new Student();
		s.setRollNumber(25);
		s.setName("Sharayu");
		
		int roolNumber = s.getRollNumber();
		String name1 = s.getName();
		
		
		System.out.println(roolNumber);
		System.out.println(name1);
		
	}

}
