package method_overriding_rules;

class LL{
	native void m1();
}

class PP extends LL{
	
	@Override
	native void m1();
}


public class Rule8 {

}
