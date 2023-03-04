package student;

public class School {
	private String regNo;
	private String schoolName;
	private Address schoolAddress;

	School() {
	}

	public School(String regNo, String schoolName, Address schoolAddress) {
		super();
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
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

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
}
