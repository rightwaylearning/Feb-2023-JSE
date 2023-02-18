package ststic_method;

public class Class_Static {
	
	static int a=5;
	static int b=9;
	int m=10;
	int n=20;
	
	public void m1()
	{
		System.out.println(Class_Static.a);
		System.out.println(Class_Static.b);
		System.out.println(this.m);
		System.out.println(this.m);
		
	}
	 static void  m2()
	{
		 Class_Static cs= new Class_Static();
		System.out.println(a);
		System.out.println(b);
		System.out.println(cs.m);
		System.out.println(cs.n);
	}
	

}
