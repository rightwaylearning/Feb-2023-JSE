package factory;

public class Controller {
	
	
	public static void main(String[] args) {
		
		// first way
		C c = new C();
		B b = new B(c);
		A a= new A(b);
		System.out.println(a.message);
		
		//-------------------------
		 // second way
		
		 A a1 = AFactory.getAInstance();
		System.out.println();
		
		
		
	}

}
