package method_overriding_rules;

class W{}
class N extends W{}
class M extends N{}

class P{
	
	W m1(int a) {
		return new W();
	}
	Object m1() {
		return "";
	}
	
	class C extends P{
		@Override
		M m1(int a) {
			return new M();
		}
		@Override
		String m1() {
			return "";
		}
	}
	
}

//3]return type of both method should be same (primtive (8) & void)
//4]In case of return type is reference type then inside class we can keep same reference type or it's child also allow but in refernce type not in case of primitive





public class Rule2 {

}
