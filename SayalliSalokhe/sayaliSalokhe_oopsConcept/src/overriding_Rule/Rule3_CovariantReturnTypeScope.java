package overriding_Rule;

class AA {
	String m1() {
		return null;

	}
}

class N extends AA {
	String m1() {  //Same Co-variant return type allow
		return null;

	}

}

class BB extends AA {
	@Override
	Object m1() // The return type is incompatible with Test22.m1()
	{
		return null;

	}
}

public class Rule3_CovariantReturnTypeScope {
	public static void main(String[] args) {

	}

}
