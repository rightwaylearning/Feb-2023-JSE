package cas1.method.overloading;

public class Test1 {

	void m1(Integer a) {
		System.out.println("Integer:- match");
	}

	void m1(Number a) {
		System.out.println("Number:- near Parent");
	}
//
//	void m1(float a) {
//		System.out.println("float:- after auto-unboxing OR auto promotion");
//	}

	public static void main(String[] args) {
		Test1 t = new Test1();
	//	t.m1('A');  // double - primitive , NO,boxting Double,Number
	}
}
