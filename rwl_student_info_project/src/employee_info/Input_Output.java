package employee_info;

public class Input_Output {

	public Address employeeAdress() {
		
		Address adr = new Address();
		adr.setLine1("Pune");
		adr.setLine2("Near Wagholi");
		adr.setPin(4322333);
		
		
		return adr;
		
	}
	
    public Company getCompanyInfo() {
    	
    	Company company = new Company();
    	company.setAdr(new Address("b.a baif", "wagholi", 3223323));
    	company.setCompanyName("infosys");
    	company.setGstNo("432/323/434/323");
    	
    	
    	return company;
    }
    
    public int[] get_SalaryDetails() {
    	
    	int[] salary = new int[3];
    	salary[0]= 43222;
    	salary[1] = 32343;
    	salary[2] = 323223;
    	
    	
    	return salary;
    	
    }
	
    public void printEmployeeInfo(Employee e) {
    	
    	System.out.println(e.getName());
    	System.out.println("Check karne ke liye getClass kya hota hai = "+e.getClass());
    	System.out.println(e.getDoj());
    	
    	System.out.println("<<<<<<<<<<<<Employeeeee Address>>>>>>>>>>>");
    	Address adr=e.getAdr();
    	
    	System.out.println(adr.getLine1());
    	System.out.println(adr.getLine2());
    	System.out.println(adr.getPin());
    	
    	System.out.println("<<<<<<<<<<Address Over>>>>>>>>>>");
    	
    	System.out.println("<<<<<<<<<<<<Company Info>>>>>>>>>");
    	
    	Company company = e.getCom();
    	System.out.println(company.getCompanyName());
    	System.out.println(company.getGstNo());
    	System.out.println(company.getAdr().getLine1());
    	System.out.println(company.getAdr().getLine2());
    	System.out.println(company.getAdr().getPin());
      
    	System.out.println("<<<<<<<<<Company Info over>>>>>>>>");
    	
    	System.out.println("<<<<<<<<<Salary Details>>>>>>>>>>");

    	String[] str = new String[3];
    	str[0]= "Dec2022";
    	str[1]= "Jan2023";
    	str[2]= "Feb2023";
    	
    	int[] salary =e.getSalary();
    	
    	int i = 0 ;
    	while(i < salary.length ) {
    		System.out.println(str[i] + " = " + salary[i]);
    		i++;
    	}
    	
    	
    	System.out.println("<<<<<<<<Details Over>>>>>>>>>>>");
    	
    	
    
    }
    
    
}
