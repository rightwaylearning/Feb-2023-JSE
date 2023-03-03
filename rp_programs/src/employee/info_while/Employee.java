package employee.info_while;

public class Employee {
	
	static int emp;
	private int employeeId;
	private String empName;
	private double empSalary;
	
	Employee(){}

	public Employee(int employeeId, String empName, double empSalary) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
