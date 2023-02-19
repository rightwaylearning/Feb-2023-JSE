package getter_setter_with_maultile_classes;

public class Student {
	private String stuent_name;
	private String email;
	private long stud_Phone_No;
	private HomeAddress homeAddress;
	private CollegeDetails details;

	public String getStuent_name() {
		return stuent_name;
	}

	public void setStuent_name(String stuent_name) {
		this.stuent_name = stuent_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getStud_Phone_No() {
		return stud_Phone_No;
	}

	public void setStud_Phone_No(long l) {
		this.stud_Phone_No = l;
	}

	public HomeAddress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public CollegeDetails getDetails() {
		return details;
	}

	public void setDetails(CollegeDetails details) {
		this.details = details;
	}

}
