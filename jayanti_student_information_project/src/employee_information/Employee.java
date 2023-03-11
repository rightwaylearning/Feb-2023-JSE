package employee_information;

public class Employee {
	
	private int empId;
	private String empName;
	private Address adr;
	private Company com;
	private int[] last4_Month_Salary;
	
	//default constructor
	public Employee() {
	}
	
	//parameterized constructor
	public Employee(int empId, String empName, Address adr, Company com,int[] last4_Month_Salary ) {
		this.empId= empId;
		this.empName = empName;
		this.adr = adr;
		this.com = com;
		this.last4_Month_Salary =last4_Month_Salary;
	}
	
	//getters
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName()  {
		return empName;
	}
	
	public Address getAdr() {
		return adr;
	}
	
	public Company getCom() {
		return com;
	}
	
	public int[] getSalary() {
		return last4_Month_Salary;
	}
	
	//setters
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName= empName;
	}
	
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public void setCom(Company com) {
		this.com = com;
	}
	
	public void setSalary(int[] last4_Month_Salary) {
		this.last4_Month_Salary =last4_Month_Salary;
	}
	
}
