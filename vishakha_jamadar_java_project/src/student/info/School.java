package student.info;

public class School {
	private int regNo;
	private String schoolName;
	private Address schoolAddress;
	

School(){}


public School(int regNo, String schoolName, Address schoolAddress) {
	super();
	this.regNo = regNo;
	this.schoolName = schoolName;
	this.schoolAddress = schoolAddress;
}


public int getRegNo() {
	return regNo;
}


public void setRegNo(int regNo) {
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