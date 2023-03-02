package array.example;

public class Employee {

	private String employeeName;
	private int empID;
	private int empSalary;

	public Employee() {

	}

	public Employee(String employeeName, int empID, int empSalary) {
		super();
		this.employeeName = employeeName;
		this.empID = empID;
		this.empSalary = empSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
