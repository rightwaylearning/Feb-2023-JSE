package method.call.rule;

public class B {
	int x;
	int y;
	
	void k1() {
		System.out.println("I am a k1 method");
		k2();	
	}
	  
	static void k2() {
		System.out.println("I am a k2 method");
		
	}

}
