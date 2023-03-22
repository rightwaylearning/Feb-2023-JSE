package reusability_inheritance;

public class Child extends Parent {
	
	void m3(Child c) {
		
		System.out.println("this is m3 method child ");
		c.m1();
	}
	
	void m4() {
		System.out.println("this is m4 method of child");
		this.m2();
	}

	void m5(int x ,int y,Child c) {
		
//		Child c = new Child();
		
	int product= 	c.m3(x,y);   //this.m3(x,y)  use karu shakta this is ref 
//	                               var pointing towards object who is calling that method
	
	System.out.println(product);
	
	}
	
}
