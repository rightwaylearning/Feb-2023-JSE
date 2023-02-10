package method.variables.access;

public class Case2_InDifferentClass {
	void m1()//instance/non static method
	{
		Case2_Declaration c=new Case2_Declaration();
		System.out.println(c.l);
		System.out.println(c.r);
		System.out.println(Case2_Declaration.m);
		System.out.println(Case2_Declaration.n);//need  to create object or class name in same class to access static and instance variables.
	}
	static void m2()//static method
	{
		Case2_Declaration c2=new Case2_Declaration();//create object for access instance variable
		System.out.println(c2.l);
		System.out.println(c2.r);
		System.out.println(Case2_Declaration.m); //best practice to access static varable using class name
		System.out.println(Case2_Declaration.n);
		
	}

}
