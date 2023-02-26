package student_Info;

public class School {

	private String regNo;
	private String schoolName;
	private Address adr;

	public School() {
	}

	public School(String regNo, String schoolName, Address adr) {
		super();
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.adr = adr;
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

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
