package array.examples;

public class Student {
	private String name;
	private int rollnumber;
	  
	
	   public Student() {
		   
	   }


	public Student(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollnumber() {
		return rollnumber;
	}


	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	  

}
