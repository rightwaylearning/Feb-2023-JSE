package static_factory;

public class A {
	
	String messageA;
	
	public A(B b) {
		this.messageA = b.message;
		
	}

}
