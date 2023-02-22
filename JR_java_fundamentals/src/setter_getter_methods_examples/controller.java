package setter_getter_methods_examples;


public class controller {
	
	public static void main(String[] args) {
		
		Employee E1 = new Employee();
		E1.setEmpId(134);
		E1.setEmpName("Aru");
		
					Address adr = new Address();
					adr.setLine1("House no= 724, Anand Nagar");
					adr.setLine2("Wagholi, pune");
					adr.setPincode(712207);
					
		E1.setAdr(adr);
		E1.setSalary(30000);
		
		
	//.....................................................
		
		int empId = E1.getEmpId();
		System.out.println("Employee Id =" +empId);
		
		String name = E1.getEmpName();
		System.out.println("Employee Name =" +empName);
		
     System.out.println("--------------Address--------------------");
		
		Address  adr1 = E1.getAdr();
		System.out.println("Line 1 = "+adr1.getLine1());
		System.out.println("Line 2 = "+adr1.getLine2());
		System.out.println("Pincode = "+adr1.getPincode());
		
		double salary = E1.getSalary();
		System.out.println("Salary=" +salary);

		
	
	}

}
