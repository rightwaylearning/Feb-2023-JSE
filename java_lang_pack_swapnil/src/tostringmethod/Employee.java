package tostringmethod;

 

public class Employee{
	Integer empId;
	String empname;
	public Employee(Integer empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		//return "Employee [empId=" + empId + ", empname=" + empname + "]";
		return "tostring method overided";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e2 = (Employee) obj;
			if(this==obj) {
				return true;
			}
			if(this.empId.equals(e2.empId) && this.empname.equals(e2.empname)) {
				return true;
			}
			
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee(101,"Swapnil");
		Employee e1 = new Employee(102, "Swapnil");
		//e=e1;
		//Employee e3 = e1;
		
		
//		System.out.println(e.toString());
//		System.out.println(e1.toString());
//		System.out.println(e);
//		System.out.println(e1);
		
		System.out.println(e.equals(e1));
		
	}



	
}
