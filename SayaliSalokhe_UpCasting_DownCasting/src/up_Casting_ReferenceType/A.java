package up_Casting_ReferenceType;

public class A {
	
      }
class  B extends A
{
	
}
class C extends B
{

}

class D extends C
{
}
class EntryPoint
{
	public static void main(String[] args) {
		D d=new D();
		C c=new D();
		B b=new D();
		A a=new D();
		Object object=new D();
		System.out.println();
		//parent class reference can hold child class object (up casting)
		
		//but child class reference does not hold parent class object(down casting)
		//C c1=new A(); Type mismatch: cannot convert from A to C
		
		//it is also known as reference type casting
	}
}
