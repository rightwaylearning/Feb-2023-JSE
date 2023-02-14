package mix_Method_Call;

public class Tester {
	void s1()
	{
		System.out.println("this is instance method s1 of a other class");
		Test test=new Test(); //create a object for access instance variables.
		System.out.println(test.a); //Instance variables a and b
		System.out.println(test.b);
		System.out.println(Test.x);//static variable x,y
		System.out.println(Test.y);
	    test.m();//instance method
	    test.n();
	    Test.n1();//static method
	    Test.m1();
		
	}
	static void s2()
	{
		System.out.println("this is static  method  s2 of other class");
		Test test=new Test(); //create a object for access instance variables.
		System.out.println(test.a); //Instance variables a and b
		System.out.println(test.b);
		System.out.println(Test.x);//static variable x,y
		System.out.println(Test.y);
	    test.m();//instance method
	    test.n();
	    Test.n1();//static method
	    Test.m1();
	}

}
