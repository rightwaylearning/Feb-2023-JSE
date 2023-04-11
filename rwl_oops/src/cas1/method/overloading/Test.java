package cas1.method.overloading;

class A{
	
	void m1(int a) {
		System.out.println("int - match");
	}
	
	void m1(float f) {
		System.out.println("float -auto promotion");
	}
	
	void m1(Integer i) {
		System.out.println("Integer:- auto-boxing");
	}
	
	void m1(Number n) {
		System.out.println("Number:- near Parent");
	}
	

	void m1(Object o) {
		System.out.println("Object:- root parent");
	}
}


public class Test {

	public static void main(String[] args) {
		
		A a= new A();
		int i = 10;
		a.m1(i);
	}
}
