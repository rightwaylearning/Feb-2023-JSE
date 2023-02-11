package method_call_rule;

public class Entry {
	
	public static void main(String[] args) {
		
		B b = new B ();
		b.m1();
		
		B.m2();
		
		A a = new A ();
		a.a1();
		
		
	}

}
