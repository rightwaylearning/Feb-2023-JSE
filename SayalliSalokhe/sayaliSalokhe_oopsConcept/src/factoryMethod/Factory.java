package factoryMethod;


public class Factory {
	public static A getInstance()
	{
		return new A(new B(new C()));
		/*
		 * C c= new C(); B b=new B(c); A a=new A(b); return a;
		 */

		//return new A(new B());
		
	}
	
	

}
