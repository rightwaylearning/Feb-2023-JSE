package student_info;

public class School {
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public Address getSchoolAddress() {
		return SchoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		SchoolAddress = schoolAddress;
	}

	public School(String regNo, String schoolName, Address schoolAddress) {
		super();
		this.regNo = regNo;
		SchoolName = schoolName;
		SchoolAddress = schoolAddress;
	}

	private String regNo;
	private String SchoolName;
	private Address SchoolAddress;

	public School() {

	}
}
