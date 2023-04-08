package overriding_Rule;


class ss { // non native
	void m1() {
	}

}

abstract class ss1 extends ss { // native
	native void m1();

}

class ss2 extends ss1 {  //non-native

	@Override
	void m1() {

	}
}
public class Rule8_Native {
public static void main(String[] args) {
	
}
}
