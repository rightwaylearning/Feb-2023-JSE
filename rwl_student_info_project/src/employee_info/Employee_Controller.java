package employee_info;

public class Employee_Controller {

	public static void main(String[] args) {

		Input_Output i = new Input_Output();

		Employee e = new Employee();
		e.setName("Swapnil Satyavan Vyavahare");
		e.setAdr(i.employeeAdress());
		e.setCom(i.getCompanyInfo());
		e.setDoj("28-NOV-2022");
		e.setSalary(i.get_SalaryDetails());

		i.printEmployeeInfo(e);

	}

}
