package setter.getter.main.employeeinfo;

public class Employee {
	
	private int empId;
	private String empName;
	private Address adr;
	
//	ya madhe ref var pn chalel tyacha userdefine banav lagel
//	tari return te Address ch karta na 
	
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public Address getAdr() {
		
		return this.adr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	

}
