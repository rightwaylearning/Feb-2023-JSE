package arrays;

public class Employee {
	int empid;
	String name;
	String company;
	public Employee() {}
	
	public Employee(int empid, String name, String company) {
	
		this.empid = empid;
		this.name = name;
		this.company = company;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
