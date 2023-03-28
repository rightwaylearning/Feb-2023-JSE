package poly.examples;

class Example{
	
	void m1(int a, int b) {
		System.out.println("int,int");
	}
	
	void m1(byte b,byte b1) {
		System.out.println("byte, byte");
	}
	
	void m1(double d1, double d2) {
		System.out.println("double,double");
	}
	
}


public class CompileTimePoly {

	public static void main(String[] args) {
		
		short s1= 10;  short s2 = 20;
		
		Example e = new Example();
		e.m1(s1, s2);
		// exactly match
		
		e.m1(10.0f,23); // float, int
		
		e.m1('A','B');
	}
}
