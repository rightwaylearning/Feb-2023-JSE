package mix_Method_Call;

public class Test {
	int a;
	int b;
	static int x;
	static int y;
	
	void m()
	{
	 System.out.println("this is intance method m");
	 System.out.println(a);//Instance variables a and b
	 System.out.println(b);
	 System.out.println(x);//static variable x,y
	 System.out.println(y);
	 n(); //instance method
	 m1();//static method.
	 n1();
	}
	void n()
	{
		 System.out.println("this is intance method n");	
		 System.out.println(a);//Instance variables a and b
		 System.out.println(b);
		 System.out.println(x);//static variable x,y
		 System.out.println(y);
		 m(); //instance method
		 m1();//static method.
		 n1();
	}
	static void m1()
	{
		System.out.println("this is static method m1");
		Test test=new Test(); //create a object for access instance variables.
		System.out.println(test.a); //Instance variables a and b
		System.out.println(test.b);
		System.out.println(Test.x);//static variable x,y
		System.out.println(Test.y);
	    test.m();//instance method
	    test.n();
	    Test.n1();//static method
	}
	static void n1()
	{
		System.out.println("this is static method n1");	
		Test test=new Test(); //create a object for access instance variables.
		System.out.println(test.a); //Instance variables a and b
		System.out.println(test.b);
		System.out.println(Test.x);//static variable x,y
		System.out.println(Test.y);
	    test.m();//instance method
	    test.n();
	    Test.m1();//static method
		
	}
	

}
