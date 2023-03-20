package factory;

public class ContolWay {
	
	public static  A getFactory() {
		
		C c = new C();
		B b = new B(c);
		A a = new A(b);
		
		//return a;
		
		
//............. OR................
		
		
		return new A(new B(new C()));
	}

}
