package abstraction_method;

public class Controller {
	
	public static void main(String[] args) {
		
		
//		Case1 c = new Case1();
//		
//		c.a = 10;
//		c.b = "hello";
//		
//		
//		c.m1();
//		
//		System.out.println("<>>><<<<>>");
//		c.m2();
//		
//		System.out.println("<>>>>>>>>>>");
//		c.m3();
//		
//		System.out.println("<<<<<<<<>>>>>>>");
//		Case1.m5();
		
		
		Case1 c1 = new Child();
		
		c1.m1();
		System.out.println("<<<<<>>>>>>");
		c1.m2();
		System.out.println("<<<<<>>>>>>");
		
		
		System.out.println("Child Class Only");
		Child c = new Child();
		
		c.a = 32;
		c.b = "String";
		
		c.m1();
		System.out.println("<<<<<>>>>>>");
		c.access2();
		
		
	}

}
