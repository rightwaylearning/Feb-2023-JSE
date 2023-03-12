package employee_information;

public class Input_Output {
	
	public Address employeeAddress() {
		
		Address adr = new Address();
		adr.setLine1("Near tathe Hospital");
		adr.setLine2("Aanand Nagar");
		adr.setCity("Wagholi pune");
		adr.setPincode(412207);
		
		return adr;
		
		
	}
	
	public Company getCompanyInformation() {
		Address adr=new Address("ABC Complex", "Vimannagar", "Pune", 412209);
		Company company = new Company();
		company.setCompanyName("TCS");
		company.setGstNo("123/456/789");
		company.setAdr(adr);
		
		
		return company;
		
		
	}
	
	public int[] get_SalaryDetails() {
		
		int[] salary = new int[3];
		salary[0]=40970;
		salary[1]=45380;
		salary[2]=50250;
		
		return salary;
	}
	
	public void printEmployeeInformation(Employee e) {
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		
		System.out.println("<......Employee Address.......>");
		Address adr=e.getAdr();
		
		System.out.println(adr.getLine1());
		System.out.println(adr.getLine2());
		System.out.println(adr.getCity());
		System.out.println(adr.getPincode());
		
		System.out.println("<_________Address over_________>");
		
		System.out.println("<*************Company Information**************>");
		
		Company company = getCompanyInformation();
		System.out.println(company.getCompanyName());
    	System.out.println(company.getGstNo());
    	System.out.println(company.getAdr().getLine1());
    	System.out.println(company.getAdr().getLine2());
    	System.out.println(company.getAdr().getPincode());
      
    	System.out.println("<<<<<<<<<Company Info over>>>>>>>>");
    	
    	System.out.println("<<<<<<<<<Salary Details>>>>>>>>>>");
		
    	String[] str = new String[3];
    	str[0]= "Dec2022";
    	str[1]="Jan2023";
    	str[2]="Feb2023";
    	
    	int[] salary =e.getSalary();
    	int i=0;
    	while(i< salary.length) {
    		System.out.println(str[i] + "=" +salary[i]);
    		i++;
    		
    	}
    	
    	System.out.println("..........Salary Details Over..........");
	}
	
	

}

