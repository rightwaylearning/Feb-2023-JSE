package constructor;

public class Employee {
	
	int empId;
	String empName;
	Double salary;
	
	Employee(){
		System.out.println("Default Constructor is called");
		
	}
	
	//Parameter Arguments
	 Employee (int empId,String empName,Double salary){
		 System.out.println("Parameteries constructor is called");
		 this.empId=empId;
		 this.empName=empName;
		 this.salary=salary;
	 }
	
	public void employeeInfo() {
		System.out.println("Employee ID NO: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+salary);
	}

}
