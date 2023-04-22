package sample_programs;

class Student{
	private String name;
	private Integer rollNumber;
	
	public Student() {}

	public Student(String name, Integer rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student[name=" + name + ",rollNumber=" + rollNumber + "]";
	}
	
}


public class ToStringMethodUse {
	
	public static void main(String[] args) {
		Student s= new Student("mahesh",101);
	    System.out.println(s);//s.toString();
		
	}

}
