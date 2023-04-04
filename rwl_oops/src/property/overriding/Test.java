package property.overriding;

class Parent{
	int x = 10;
	
	void m1() {
		System.out.println("Parent");
	}
	
}
class Child extends Parent{
	
	int x = 100;
	
	@Override
	void m1() {
		System.out.println("Child");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Parent p= new Child();
		p.m1();
		System.out.println(p.x);
		//** object property we can't override , but we can write code looks like property overriding but it is compile time decision .
		// ** we can happly override method only not a properties
		 
	}
}
