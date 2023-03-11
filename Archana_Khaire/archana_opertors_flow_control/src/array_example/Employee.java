package array_example;

public class Employee {

	private int rollNumber;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}

	  public Employee(int rollNumber, String name, Double salary) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.salary = salary;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	  
	  
	
	
}
