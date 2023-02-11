package method_call_rule;

public class B {
	int x ;
	int y;
	
	
	void k1 () {
		System.out.println("i am method k1");
		k2();
		
	}
void k2 () {
	System.out.println("i am method k2");
	
}
}
