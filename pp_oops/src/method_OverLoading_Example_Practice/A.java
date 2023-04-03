package method_OverLoading_Example_Practice;
	
public class A {
	void m1() {
		System.out.println("A m1()");
	}
	void m2() {
		System.out.println("A m2()");
	}
	
}
class B extends A{
	void m1() {
		System.out.println("B m1()");
	}
	void m2() {
		System.out.println("B m2()");
	}
	
}
class C extends B{
	void m2() {
		System.out.println("C m2()");
	}
	void m3() {
		System.out.println("C m3()");
	}
	  
	  
	
	
	

}
