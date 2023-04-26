package equals.and.hashcode.override;

public class Employee {
	public String employeename;
	public Integer employeeeId;
	Address address;
	
	Employee (){}

	public Employee(String employeename, Integer employeeeId, Address address) {
		super();
		this.employeename = employeename;
		this.employeeeId = employeeeId;
		this.address = address;
	}
	@Override
	public int hashCode() {
		
		return this.employeeeId.hashCode() + this.employeename.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			if(this.employeeeId.equals(e.employeeeId) && this.employeename.equals(e.employeename)
		&& this.address.equals(e.address)){
				return true;
			}
			
		}
		
		return false;
	}

}
