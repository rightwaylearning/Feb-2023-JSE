package default_values;

public class Controller {

	public static void main(String[] args) {
		
		Test t= new Test();
		
		System.out.println("byte = "+t.getB());
		System.out.println("short = "+t.getS());
		System.out.println("int = "+t.getI());
		System.out.println("long = "+t.getL());
		
		System.out.println("float = "+t.getF());
		System.out.println("double = "+t.getD());
		
		System.out.println("char = "+t.getC());
		System.out.println("boolean = "+t.isB1());
		
		System.out.println("String str = "+t.getStr());
		System.out.println("Address adr = "+t.getAdr());
		
		// NOTE:
		// all instance properties (primitive & reference type)
		   // having some default values like above
		// all above properties same for static also
		
		// static properties default values
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		System.out.println("byte = "+StaticTest.b);
		System.out.println("short = "+StaticTest.s);
		System.out.println("int = "+StaticTest.i);
		System.out.println("long = "+StaticTest.l);
		
		System.out.println("float = "+StaticTest.f);
		System.out.println("double = "+StaticTest.d);
		
		System.out.println("char = "+StaticTest.c);
		System.out.println("boolean = "+StaticTest.b1);
		
		System.out.println("String str = "+StaticTest.str);
		System.out.println("Address adr = "+StaticTest.adr);
		
		
		
		
	}
}
