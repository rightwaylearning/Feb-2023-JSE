package factory;

public class Controller {

	public static void main(String[] args) {
		
		
		// First way
		C c = new C();
		B b = new B(c);
		A a = new A(b);
		System.out.println(a.message);
		//-------------------------------------
		
		//Second way
		A a1 = AFactory.getAInstance();
		System.out.println(a1.message);
	}
}
