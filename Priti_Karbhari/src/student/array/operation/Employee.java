package student.array.operation;

public class Employee {
	
	private String employeeName;
	private int employeeNumber;
	private double employeeSalary; 
	
	public Employee() {}

	public Employee(String employeeName, int employeeNumber, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
