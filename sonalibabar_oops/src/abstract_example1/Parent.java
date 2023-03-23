package abstract_example1;

public class Parent {
	public void homeConstruction()
	{
		System.out.println("Old Style");
	}
	
	public void bankBalance()
	{
		System.out.println("FD=300000.00");
	}
	
}
class Child extends Parent
{
	public void homeConstruction()
	{
		System.out.println("new Style");
	}
	
	public void ownBussiness()
	{
		System.out.println("Digital Marketing");
	}
}











