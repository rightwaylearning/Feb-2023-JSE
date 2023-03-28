package factory.method;

public class AFactory {
	
	public static A getAInstance() {
	//	C c=new C();
		
	//	B b=new B(c);
		
	//	A a=new A(b);
	//	return a;
		
       return new A(new B(new C()));
       
	}

}
