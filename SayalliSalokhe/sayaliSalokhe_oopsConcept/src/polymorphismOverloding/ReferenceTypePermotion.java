package polymorphismOverloding;

class Test3 {
	//void m1(int a) {
	//	System.out.println("int match");
	//}

	/*
	 * void m1(float b) { System.out.println("float match"); }
	 */
	void m1(char a) {
		System.out.println("char match");
	}

	/*
	 * void m1(double c) { System.out.println("double match"); }
	 */

	/*
	 * void m1(long d) { System.out.println("long match"); }
	 */
	void m1(Object a)
	{
		System.out.println("Reference root object match");
	}
	/*
	 * void m1(Number a) { System.out.println("Reference parent  Number match"); }
	 */
	/*
	 * void m1(Integer a) { System.out.println("Reference Integer match"); }
	 */

}

public class ReferenceTypePermotion {
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.m1(120);

	}

}
