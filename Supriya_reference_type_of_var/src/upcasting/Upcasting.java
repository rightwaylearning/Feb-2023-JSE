package upcasting;

public class Upcasting {
	
	class A{
		
	}
	class B{
		
	}
	class C{
		
	}
	
	C a =new C();
	//C a =new B();
	
	B a1=new B();
	A a2=new A();
	Object a3=new Object();
	
	public static void main(String[] args) {
		System.out.println("good morning");
		//System.out.println("20+20");
	}

}
