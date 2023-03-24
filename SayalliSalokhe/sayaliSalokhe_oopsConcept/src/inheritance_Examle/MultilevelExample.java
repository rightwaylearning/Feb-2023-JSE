package inheritance_Examle;


class A{
	
	public void m1() {
		System.out.println("m1 of A");
		
	}
}

class B extends A {
	public void m2() {
		System.out.println("m2 of B");
		
	}
}
class C extends B{
	public void m3() {
		System.out.println("M3 of C");
	}
}
public class MultilevelExample {
	public static void main(String[] args) {
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		
	}

}