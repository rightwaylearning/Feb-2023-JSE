package setter_getter_method;

public class Info {
	
	private String name;
	private int employeeId;
	private String companyName;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setEmployeeid(int employeeId){
		this.employeeId= employeeId;
	}
	public int getEmployeeid() {
		return this.employeeId;
	}
	
	public void setCompanyname(String companyName) {
		this.companyName=companyName;
	}
	public String getCompanyname() {
		return this.companyName;
	}
}
