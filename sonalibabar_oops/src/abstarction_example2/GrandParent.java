package abstarction_example2;

public class GrandParent {
	
	void m1()
	{
		System.out.println("I am method of m1 GrandParent class");
	}
	
	void m2()
	{
		System.out.println("I am method of m2 of GrandParent class");
	}

}

class Parent extends GrandParent
{
	void m2()
	{
		System.out.println("I am method of M2 of Parent class");
	}
	void m3()
	{
		System.out.println("I am Method of M3 of Parent class");
	}
	

}

class Child extends Parent
{
	void m3()
	{
		System.out.println("I am method of M3 of child class");
	}
	void m4()
	{
		System.out.println("I am Method of M4 of child class");
	}
	

}