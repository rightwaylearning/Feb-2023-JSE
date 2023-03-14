package static_factory;

public class StaticWayToCall {
	
	public static A m1() {
		
		C c = new C();
		B b = new B(c);
		A a =new A(b);
	
		return a;
		
	}

}
