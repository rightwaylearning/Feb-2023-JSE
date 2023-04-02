package method_overriding_rules;

abstract class KGF_3{
	 
	abstract void m1();
 }


public class Rule7 extends KGF_3{
	void m1() {
		
	}
}

//-------------------

class MM{
	
	void m1() {
		// -------------
	}
}

abstract class HH extends MM{
	@Override
	abstract void m1();
}



