package instance.stati.method.var.access;

public class Case2 {

	int x1 = 3111;
	int y1 = 11112;
	
	void k1 () {
		
		System.out.println("hello hai this ref variable aahe " + this.x1);
		
		Case1 c= new Case1();
		c.a = 122;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(Case1.x);
		System.out.println(Case1.y);
	}
	
	static void k2() {
		
			
			Case1 c= new Case1(); //same gheu shaktoh karan te local
			c.a = 122;
			System.out.println(c.a);
			System.out.println(c.b);
			System.out.println(Case1.x);
			System.out.println(Case1.y);
		
	}
	
}
