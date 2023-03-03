package employee_info;

public class Input_Output {

	public Address employeeAdress() {
		Address adr = new Address();
		adr.setLine1("Sr No 529/2, Plot No 15");
		adr.setLine2("Shivraje Society dhabhade Wasti Charaholi");
		adr.setPin(411039);

		return adr;
	}

	public Company getCompanyInfo() {
		Company c = new Company();
		c.setCompanyName("TCS");
		c.setGstNo("33AAACR4849R4ZP");
		Address adr = new Address();
		adr.setLine1("Maan, Sahyadri Park, Plot No. 2 & 3, Phase 3");
		adr.setLine2(" Rajiv Gandhi Infotech Park, Maan, Hinjawadi, Pune, Maharashtra");
		adr.setPin(411057);
		c.setAdr(adr);

		return c;

	}

	public int[] get_SalaryDetails() {

		int[] last_3_month_salary = new int[3];
		last_3_month_salary[0] = 50000;
		last_3_month_salary[1] = 50500;
		last_3_month_salary[2] = 50200;

		return last_3_month_salary;
	}

	public void printEmployeeInfo(Employee e) {

		System.out.println("Employee Name -" + e.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Address Start>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employe Address line 1 -" + e.getAdr().getLine1());
		System.out.println("Employe Address line 2 -" + e.getAdr().getLine2());
		System.out.println("Employe Address pincode -" + e.getAdr().getPin());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Address End>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Company Info Start>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Company Name -" + e.getCom().getCompanyName());
		System.out.println("Company Name -" + e.getCom().getGstNo());
		System.out.println("Company Address");
		System.out.println("Company Name -" + e.getCom().getAdr().getLine1());
		System.out.println("Company Name -" + e.getCom().getAdr().getLine2());
		System.out.println("Company Name -" + e.getCom().getAdr().getPin());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Company Info End>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Salary Info Start>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employee Salary");
		System.out.println("Employee Date Of Joining  =" + e.getDoj());
		String[] month = { "DEC-2022", "JAN-2023", "FEB-2023" };
		int[] salary = e.getSalary();
		int i = 0;
		while (i < salary.length) {
			System.out.println(month[i] + "=" + salary[i]);
			i++;

		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Employee Salary Info End>>>>>>>>>>>>>>>>>>>>");

	}

}
