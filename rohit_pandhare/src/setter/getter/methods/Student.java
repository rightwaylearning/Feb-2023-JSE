package setter.getter.methods;

public class Student {

	private String name;
	private int rollNumber;
	private String schoolName;

	public void setSchoolName() {
		this.schoolName = "Rajiv Gandhi Highschool ";
//		System.out.println(this.schoolName);

	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setName() {
		this.name = "rahul";
//		System.out.println(this.name);

	}

	public String getName() {
		return this.name;
	}

	public void setRollNumber() {
		this.rollNumber = 43;
//		System.out.println(this.rollNumber);

	}

	public int getRollNumber() {
		return rollNumber;
	}

}
