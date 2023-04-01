package method_overriding_rules;


class Parent{
	
	void methodOne(int a) {  // methodOne(int)
		
	}
}

class Child extends Parent{
	
	@Override
	void methodOne(int c) {  // methodOne(int)
		
	}
	
}

// 1] method signature should be same
// 2] use @Override annotation :- its good programming practice




public class Rule1 {

	public static void main(String[] args) {
		
		
	}
}
