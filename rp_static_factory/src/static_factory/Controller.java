package static_factory;

public class Controller {

	public static void main(String[] args) {
	      
		C c = new C();
		B b = new B(c);
		A a =new A(b);
		
	   System.out.println(a.messageA);
		
		
	}
}
