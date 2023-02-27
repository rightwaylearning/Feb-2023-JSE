package student.info;

public class School {
	
	String regNo;
	String schoolName;
	Address schoolAdr;
	
	public School(){}

	public School(String regNo, String schoolName, Address schoolAdr) {
		
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.schoolAdr = schoolAdr;
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

	public Address getSchoolAdr() {
		return schoolAdr;
	}

	public void setSchoolAdr(Address schoolAdr) {
		this.schoolAdr = schoolAdr;
	}
	
	

}
