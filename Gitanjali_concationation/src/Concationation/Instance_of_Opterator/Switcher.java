package Instance_of_Opterator;

public class Switcher {
void m1() {
	Object o=new A();
}
}
class A{
	void testMe() {
		System.out.println("I am A class testMe method");
			}
			
			Object o=new B();
class B{
	void testMySelf(){
		System.out.println("I am B class testMySelf");
	}
	}
Object o=new C();
void testI() {
	System.out.println("I am C class testI");
}
}