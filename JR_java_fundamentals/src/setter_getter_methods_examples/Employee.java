package setter_getter_methods_examples;

public class Employee {
	
	private int empId;
	private String empName;
	private Address adr;
	private double salary;
	
	public int getEmpId()
	{
		return empId;
		
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	public Address getAdr() {
		return adr;
		
	}
	
	public void setAdr(Address adr) {
		this.adr = adr;
		
	}
	    

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
