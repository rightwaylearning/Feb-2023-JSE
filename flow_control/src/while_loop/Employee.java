package while_loop;

public class Employee {
  private int empNumber;
  private String empName;
  private double empSalary;
	
	public Employee(){}

	public Employee(int empNumber, String empName, double empSalary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
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
