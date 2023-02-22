package employee.info;

public class Controller {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpId(121);
		e.setName("Peter");
		
		           Address adr = new Address();
		           adr.setLine1("a/p abc");
		           adr.setLine2("pune");
		           adr.setPin(678900);
		
		e.setAdr(adr);
		//================================================================
		  // read data;
		
		int empId = e.getEmpId();
		System.out.println("Employee Id = "+empId);
		
		String name = e.getName();
		System.out.println("Employee name = "+name);
		
		System.out.println("--------------Address--------------------");
		
		Address  adr1 = e.getAdr();
		System.out.println("Line 1 = "+adr1.getLine1());
		System.out.println("Line 2 = "+adr1.getLine2());
		System.out.println("Pin = "+adr1.getPin());
		
			
	}
}
