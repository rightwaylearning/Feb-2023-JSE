package upcasting.pack;

class A {
	
	
}
class B extends A{
	
	
}
class C extends B{
	
}
class D extends C{
	
	
}

public class Case2 {
	
	public static void main(String[] args) {
	
//		upcasting with the help of ref var
		
		D d = new D();
		C c = new D();
		B b = new D();
		A a = new D();
		Object obj = new D();
		
//		but in this ref variable downcasting not allowed 
	
		B a1 = (B)new A();
		
//		aasa jari chala tari run time error dakhvte exception
		
//		type mismatch: cannot convert from A to B
		
		
	}

}
