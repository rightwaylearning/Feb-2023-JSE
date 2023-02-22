package setter.getter.method;

public class Controller {

		public static void main(String[] args) {
			
			
			Student s = new Student();
			
			s.setRollNumber(23);
			s.setName("Raghu");
			
			
			int rollNumber = s.getRollNumber();
				
			System.out.println(rollNumber);
			
			String name = s.getName();
			System.out.println(name);
			
			System.out.println("==============================");
			
			Employee e = new Employee();
			e.setEmployeeId(1234);
			e.setEmployeeName("Amol");
			e.setOfficeName("IBM");
			
			
			int employeeId = e.getEmployeeId();
			String employeeName = e.getEmployeeName();
			String officename = e.getOfficeName();
			
			System.out.println(employeeId);
			System.out.println(employeeName);
			System.out.println(officename);
			
			
			
			
			
		}
	}


