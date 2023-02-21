package employee.info;

public class Employee {

	private int empId;
	private String name;
	private Address adr;

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Address getAdr()
	{
		return adr;
	}

	public void setAdr(Address adr)
	{
		this.adr = adr;
	}

}
