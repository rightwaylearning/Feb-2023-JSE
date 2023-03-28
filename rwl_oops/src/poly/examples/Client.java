package poly.examples;

public class Client {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.m1(12);
		
		MethodOverloading1 obj1= new MethodOverloading1();
		
		obj1.m1(10,10.0f);
		
		
		
		P p= new C();
		p.m1();
	}
}
