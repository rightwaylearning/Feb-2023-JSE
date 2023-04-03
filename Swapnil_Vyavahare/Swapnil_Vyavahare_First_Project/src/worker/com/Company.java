package worker.com;

public class Company {
	
	private String companyname;
	private int gstNo;
	private Address adr;
	
	public Company() {}

	public Company(String companyname, int gstNo, Address adr) {
		super();
		this.companyname = companyname;
		this.gstNo = gstNo;
		this.adr = adr;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getGstNo() {
		return gstNo;
	}

	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	};
	
	
	
	
	

}
