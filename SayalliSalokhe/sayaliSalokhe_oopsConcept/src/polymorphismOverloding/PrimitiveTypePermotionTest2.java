package polymorphismOverloding;

class Test1 {
	void m1(int a) {
		System.out.println("int match");
	}

	void m1(float b) {
		System.out.println("float match");
	}

	void m1(char a) {
		System.out.println("char match");
	}

	/*
	 * void m1(double c) { 
	 * System.out.println("double match"); 
	 * }
	 */


	void m1(long d) {
		System.out.println("long match");
	}
}

public class PrimitiveTypePermotionTest2 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1('a');
		//t.m1(345.754332); //The method m1(int) in the type Test1 is not applicable for the arguments (double)
		t.m1(45.5f);
		t.m1(123400);
		t.m1(2398755433l);
		

	}
}
