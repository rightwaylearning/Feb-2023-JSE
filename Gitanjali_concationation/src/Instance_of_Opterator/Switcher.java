package Instance_of_Opterator;

public class Switcher {
void m1() {
	Object o=new AA();
}
}
class AA{
	void testMe() {
		System.out.println("I am AA class testMe method");
			}
			
			Object o=new BB();
class BB{
	void testMySelf(){
		System.out.println("I am BB class testMySelf");
	}
	}
Object o=new CC();
void testI() {
	System.out.println("I am CC class testI");
}
}