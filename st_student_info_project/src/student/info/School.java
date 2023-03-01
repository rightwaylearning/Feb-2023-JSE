package student.info;

public class School {

	private String regNo;
	private String schoolName;
	private Address schoolAddress;

	public School() {
	} // default contructor

	// parameterised constructor

	public School(String regNo, String schoolName, Address schoolAddress) {
		super();
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
	}

	// generate getter and setter

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
