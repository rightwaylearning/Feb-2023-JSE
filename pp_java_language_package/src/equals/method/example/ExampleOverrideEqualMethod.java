package equals.method.example;

class Employee1{
	int employeeName;
	String employeeId;
	float salary;
	String Address;
	
	
	Employee1(){}
	
	public Employee1(int employeeName, String employeeId, float salary, String address) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		Address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee1) {
			Employee1 e2= (Employee1)obj;
			if(this==e2) {
				System.out.println("==");
				return true;
			}
		
		if(this.employeeName==e2.employeeName && this.employeeId==e2.employeeId 
				&& this.salary==e2.salary && this.Address==e2.Address) {
			System.out.println("equals");
			
			
			return true;
		}
	}
		return false;
		
		
	}
	
	
}
public class ExampleOverrideEqualMethod {
	
	public static void main(String[] args) {
		Employee1 e1= new Employee1(121,"Akshay",19000.00f,"Jalochi Baramati Pune Maharashtra");
		Employee1 e2= new Employee1(121,"Akshay",19000.00f,"Jalochi Baramati Pune Maharashtra");
	    Employee1 e3=e1;
	    
	    
	     System.out.println(e1.equals(e2));
	     
	     System.out.println(e1.equals(e3));
	
	
	}
	
	

}
