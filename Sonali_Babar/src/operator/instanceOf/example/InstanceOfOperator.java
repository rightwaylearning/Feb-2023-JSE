package operator.instanceOf.example;


	class A
	{
		int num=10;
		
	}
	class B extends A
	{
		int numb2=20;
	}
	class C extends B
	{
		
	}
	public class InstanceOfOperator 
	{
	public static void main(String[] args) 
	{
		
	    A a=new A();
		B b=new B();
		C c=new C();
		
		boolean result= a instanceof A;
		System.out.println(result);
		
		boolean r = b instanceof B;
		System.out.println(r);
		
		boolean r1 = c instanceof B;
		System.out.println(r1);
		
		boolean r2 = c instanceof Object;
		System.out.println(r2);
		
		boolean r3 = b instanceof A ;
		System.out.println(r3);
		
		
		
		
		
		
	
		
		
		
		
	}

}
