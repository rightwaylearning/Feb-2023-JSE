package polymorphismOverlodingCases;

class Test4 {
	/*
	 * void m1(int a) { System.out.println("int match"); }
	 */

	
	void m1(Number b) {
		System.out.println("Number match");
	}

	void m1(Integer b) {
		System.out.println("Integer match");
	}

	/*
	 * void m1(Object a) { System.out.println("root match"); }
	 */

	void m1(Double c) {
		System.out.println("Double match");
	}

	/*
	 * void m1(String d) { System.out.println("String match"); }
	 */

}

public class RefernceToPrimitivePermotion {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.m1(10);
		//t4.m1("sayali");//The method m1(Number) in the type Test4 is not applicable for the arguments (String)

	}

}
