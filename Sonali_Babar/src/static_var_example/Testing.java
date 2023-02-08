package static_var_example;

public class Testing 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.x=10;
		a.y=20;
	    A.z=100;
		
		
		
		System.out.println("*************");
		
		A a1=new A();
		a1.x=50;
		a1.y=60;
	
		a.getValue();
		System.out.println("*************");
		a1.getValue();
		System.out.println("*************");
		System.out.println(a1.z);
		
		
		
		
	}

}
