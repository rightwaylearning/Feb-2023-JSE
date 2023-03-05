package student_info;

public class School {
	private String regNo;
	private String schoolName;
	private Address address;
	
	public School() {
		
	}

	public School(String regNo, String schoolName, Address address) {
		super();
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.address = address;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
