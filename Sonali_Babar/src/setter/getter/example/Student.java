package setter.getter.example;

public class Student 
{
	private int rollNumber;
	private String firstName;

	private int age;
	
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber; 
	}
	public int getRollNumber()
	{
		return this.rollNumber;
		
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		 return this.age;
	}

}
