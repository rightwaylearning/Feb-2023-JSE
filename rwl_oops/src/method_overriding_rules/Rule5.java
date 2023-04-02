package method_overriding_rules;

class K{
	
	void m1() {
		
	}
}
class J extends K{
	
	@Override
	final void m1() {
		
	}
}

public class Rule5 {

}
