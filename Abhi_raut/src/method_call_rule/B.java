package method_call_rule;

public class B {
	
	int a;
	int b;
			
	
	void m1() { 
		
		System.out.println("hi i am m1" );
		m2();
	
	}
	static void m2() {
		
		System.out.println("hi i am m2");
	}
}

