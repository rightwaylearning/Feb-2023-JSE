package defalut_Constructor;

public class Test {
	private String name;
	private int roll_No;
	
	Test(){System.out.println("this is a no arg constructor");}
	Test(String n,int a)
	{
		this.name=n;
		this.roll_No=a;
		System.out.println("argument constructor");
	}

}
