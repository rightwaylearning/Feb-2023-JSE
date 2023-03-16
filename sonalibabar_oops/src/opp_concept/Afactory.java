package opp_concept;

public class Afactory
{
	public  static  A getInstance()
	{
		C c=new C();
		B b=new B(c);
		A a=new A(b);
		
		return a ;
	}

}
