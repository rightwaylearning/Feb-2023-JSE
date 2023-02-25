package while_condition;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	
	Employee(){
		//Default constructor
	}
	
	Employee(int empId,String empName,double salary){
		
		//Parameterize constructor
		//inisialize object with our own values 
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	
	//Getters
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	//Setter
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
}
