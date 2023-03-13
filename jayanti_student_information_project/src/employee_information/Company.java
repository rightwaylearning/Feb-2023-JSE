package employee_information;

public class Company {
	
	private String companyName;
	private String gstNo;
	private Address adr;
	
	//default constructor
	public Company() {	
	}

	//parameterized constructor
	
	public Company(String companyName, String gstNo, Address adr) {
	this.companyName= companyName;
	this.gstNo = gstNo;
	this.adr = adr;
	}
	
	//getters
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getGstNo() {
		return gstNo;
	}
	
	public Address getAdr() {
		return adr;
	}
	
	//setters
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setGstNo(String gstNo) {
		this.gstNo= gstNo;
	}
	
	public void setAdr(Address adr) {
		this.adr= adr;
	}
	
}
