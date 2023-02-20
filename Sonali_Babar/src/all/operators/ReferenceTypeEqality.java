package all.operators;

class A
{
	
}
class B
{
	}
class C extends B
{
	}
public class ReferenceTypeEqality
{
	public static void main(String[] args) 
	{
		A a=new A();
		A a1=new A();
		
		boolean r= a==a1;
		System.out.println(r);
		
		B b=new B();
		B b1=b;
		System.out.println(b==b1);
		
		C c=new C();
		B b2=new B();
		
		C c1=new C();
		//A a2=c1; because there is no relation between them A And C class c1......
		
		B b3=c1;
		System.out.println(b3==c1);
		
		Object o1=new Object();
		System.out.println(o1==c1);
		
		
		
	}

}
