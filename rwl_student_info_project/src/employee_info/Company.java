package employee_info;

public class Company {

	private String companyName;
	private String gstNo;
	private Address adr;

	public Company() {
	}

	public Company(String companyName, String gstNo, Address adr) {
		super();
		this.companyName = companyName;
		this.gstNo = gstNo;
		this.adr = adr;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	};

}
