package equals.and.hashcode.override;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Address address;

	public Employee() {
	}

	public Employee(Integer employeeId, String employeeName, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return this.employeeId.hashCode() + employeeName.hashCode() + this.address.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Employee) {
			Employee e =(Employee)obj;
			if(this.employeeId.equals(e.employeeId) && this.employeeName.equals(e.employeeName)  && this.address.equals(e.address)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
