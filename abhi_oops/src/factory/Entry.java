package factory;

public class Entry {
	
	public static void main(String[] args) {
		
		// first method 
		
	/*	C c = new C();
		B b = new B(c);
		A a = new A(b);
		
	System.out.println(a.message);	*/
	
	   A r1 = ContolWay.getFactory();
		
	   System.out.println(r1.message);
	}

}
