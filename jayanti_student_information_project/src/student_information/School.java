package student_information;

public class School {
	
	private String regNo;
	private String schoolName;
	private Address schoolAddress;
	
	//default constructor
	public School() {
		
	}
	
	//parameterized constructor;
	public School(String regNo, String SchoolName, String schollAddress) {
		this.regNo = regNo;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		
	}
	
	//Getters
	
	public String getRegNo() {
		return regNo;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public Address getSchoolAddress() {
		return schoolAddress;
	}
	
	//Setters
	
	public void setRegNo(String RegNo) {
		this.regNo = regNo;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setSchoolAddress(Address adr) {
		this.schoolAddress = adr;
	}
	
	

}
