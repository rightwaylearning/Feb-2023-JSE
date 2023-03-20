package employee.info;

public class Compony {
	private String companyName;
	private String gstNo;
	private Address adr;
	
	public Compony() {
		
	}

	public Compony(String companyName, String gstNo, Address adr) {
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
	}
	

}
