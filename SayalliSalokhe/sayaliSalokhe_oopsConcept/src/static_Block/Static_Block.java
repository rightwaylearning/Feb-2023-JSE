package static_Block;

class P{
	int a;
	static int b;
	
	static {
		b=10;
		System.out.println("b="+b);
		System.out.println("static block");
	}
	
	public P() {
	System.out.println("constructor zero  args");
	}
	
	public P(int i) {
		System.out.println("constructor");
		
	}

	void m2() {
		System.out.println("method m1 of class P");
	}
	
}

public class Static_Block {
	public static void main(String[] args) {
		P p=new P();
		p.m2();
		System.out.println("----------------------------");
		P p2=new P(200);
		p.m2();
		
		
	}

}
