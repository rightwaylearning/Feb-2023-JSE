package method_variables_access;

public class Case1_InSameClass {
	 int a;   //instance variable
	 int b;   //instance variable
	static int x;   //static variable
	static int y;  //static variable
	
	void m1()//instance/non static method
	{
		System.out.println(a);
		System.out.println(b); //need not to create object or class name in same class to access static and instance variables.
		System.out.println(x);
		System.out.println(y);
	}
	static void m2()//static method
	{
		Case1_InSameClass c1=new Case1_InSameClass();//create object for access instance variable
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(Case1_InSameClass.x); //best practice to access static varable using class name
		System.out.println(Case1_InSameClass.y);
		
	}

}
