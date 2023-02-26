package setter.getter.methods;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setRollNumber(23);
		s.setName("swapnali");
		
		int rollNumber = s.getRollNumber();
		String name = s.getName();
		
		System.out.println(rollNumber);
		System.out.println(name );
		
		System.out.println("=================================================");
		
		Employee e = new Employee();
		e.setEmployeeId(1234);
		e.setEmployeeName("swapna");
		e.setOfficeName("IBM");
		
		int employeeId = e.getEmployeeId();
		String employeeName = e.getEmployeeName();
		String officename = e.getOfficeName();
		
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(officename);
	}

}
