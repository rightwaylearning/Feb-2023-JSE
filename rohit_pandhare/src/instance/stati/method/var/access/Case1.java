package instance.stati.method.var.access;

public class Case1 {

	int a ;
	int b;
	static int x;
	static int y;
	  
	void m1() {
		System.out.println("1 "+ a); //this.a is correct way to write
		System.out.println("2 "+ b); //this.b
		System.out.println("3 "+x);  //Case1.x
		System.out.println("4 " +y);  //Case1.y
	}
	
	static void m2() {

		Case1 c = new Case1();
		System.out.println(c.a); 
		System.out.println(c.b);
		
		System.out.println(x);  //Case1.x
		System.out.println(y);  //Case1.y
	}

}
