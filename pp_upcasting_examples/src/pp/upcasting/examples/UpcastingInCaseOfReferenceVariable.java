package pp.upcasting.examples;

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

public class UpcastingInCaseOfReferenceVariable {
	
	public static void main(String[] args) {
		// up.casting  // compiler is responsible to do up cating.
		C c= new C();
		B c1= new B();
		A c2= new A();
		Object c3= new Object();
		
		A a1= new A();
		
		Object a2= new A();
		
		//------------------------------------------------------------
		
		// down casting 
		C a3=(C)new A();
		
		System.out.println("hello");
	
		
		
		
		
		
		
		
	}

}
