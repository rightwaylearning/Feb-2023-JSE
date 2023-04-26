package override_method_example;

public class Employee {
	
	public Integer employeeId;
	public String employeeName;
	public Address address;
	
	Employee (){}

	public Employee(Integer employeeId, String employeeName, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(obj instanceof Employee) {
		return true;	
		}
		
		if(this.employeeName==e.employeeName && this.employeeId==e.employeeId && this.address==e.address) {
			return true;
		}
		return false;
	}
	
      
}
