package setter.getter.real.example;

public class Employee
{
	private int empId;
	private String name;
	private Address adr;
	
	public int getEmpId() {
		return empId;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public void setAdr(Address adr)
	{
		this.adr=adr;
		
	}
	public Address getAdr()
	{
		return adr;
	}

}
