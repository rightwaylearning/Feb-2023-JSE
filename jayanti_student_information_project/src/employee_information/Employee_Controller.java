package employee_information;

public class Employee_Controller {
	
	public static void main(String[] args) {
		
		Input_Output i = new Input_Output();
		
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Shivani Satav");
		e.setAdr(i.employeeAddress());
		e.setCom(i.getCompanyInformation());
		e.setSalary(i.get_SalaryDetails());
		
		i.printEmployeeInformation(e);
	}

}
