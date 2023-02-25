package setter.getter.main.employeeinfo;

public class EntryPoint {
	
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		e.setEmpId(32333);
		e.setEmpName("Rahul");
		
//		e.setAdr(new Address()); //aasa pn chalel karan 
//		aapn argument madhe value mhnjech tya ref var ch object pass
//		karat aahot
		
//		example [
//		jas ki int a = 10
//		void setNo(int a) {
			
//		}
//		parameter madhe mg aapn int a parameter aasa set kela tr
//		argument madhe aaplyala tyachi value set karav lagel 
		
//	]
		
		Address adr = new Address();
		adr.setLine1("Raj Nagar");
		adr.setLine2("Near Ganesh Nagar");
		adr.setPin(434344);
		
	    e.setAdr(adr);
//	    ya madhe ref varible lihila karan object ref var madhe
//	    store hoto na tya mule
	    
//	    aata get 
	    
	    String empName = e.getEmpName();
	    int empId = e.getEmpId();
	       
	    System.out.println(empName);
	    System.out.println(empId);
	    
//	    
	    
//	    ya cha aarth aasach hoto na
//	                  Address adr2 = new Address();
	    
	    
	    Address adr2 = e.getAdr();
	    
//	    String line3 = adr2.getLine1();
//	    String line4 = adr2.getLine2();
	
	    System.out.println(adr.getLine1());
	    System.out.println(adr.getLine2());
	    System.out.println(adr.getPin());
	    
		
	}

}
