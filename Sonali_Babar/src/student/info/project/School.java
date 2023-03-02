package student.info.project;

public class School 
{
	private String regNumber;
	private String schoolName;
	private Address address;
	
	public School()
	{
		
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
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

	public School(String regNumber, String schoolName, Address address) {
		super();
		this.regNumber = regNumber;
		this.schoolName = schoolName;
		this.address = address;
	}
	

}
