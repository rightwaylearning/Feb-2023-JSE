package equals.method.example;

class Employee{
	   Integer employeeId;
	   String employeeName;
	   Double salary;
	   
	   Employee(){}

	public Employee(Integer employeeId, String employeeName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e2=(Employee)obj;
			
			if(this==e2) {
				System.out.println("==");
				return true;              
			}
		
		if(this.employeeId.equals(e2.employeeId) && this.employeeName.equals(e2.employeeName) &&
				this.salary.equals(e2.salary)) {
			System.out.println("equals");
			return true;	
		}
		}
		return false;
		}
	}

public class OverrideEqualMethod {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(121,"Mahesh",15000.00);
		Employee e2= new Employee(121,"Mahesh",15000.00);
		Employee e3=e1;
		Myself m=new Myself();
		System.out.println(e1.equals(e3));
			
		
	}

}
class Myself{
	
}
// in reference variable we can use this overide method
//@Override
//public boolean equals(Object obj) {
//	Employee e2=(Employee)obj;
//	
//	if(this.employeeId.equals(e2.employeeId) && this.employeeName.equals(e2.employeeName) &&
//			this.salary.equals(e2.salary)) {
//		return true;
//		
//	}
//	
//	return false;
//	}



