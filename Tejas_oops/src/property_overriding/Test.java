package property_overriding;

class P{
	
	int i = 10;
	
	void m1() {
		
		System.out.println(1);
	}
	
}

class C extends P{
	int i = 30;
	@Override
	void m1() {
		
		System.out.println(2);
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		P p = new C();
		
		p.m1();
		
		System.out.println(p.i);
		
		
	}
	
	
	
}
