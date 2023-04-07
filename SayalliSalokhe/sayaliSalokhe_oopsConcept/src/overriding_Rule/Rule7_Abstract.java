package overriding_Rule;

class s { // non abstract
	void m1() {
	}

}

abstract class s1 extends s { // abstract
	abstract void m1();

}

class s2 extends s1 {  //non-abstract

	@Override
	void m1() {

	}
}

public class Rule7_Abstract {
	public static void main(String[] args) {

	}

}
