package flow_controls_and_operators;

class A{
	
}

class B{
	
}

class C extends B{
	
}

public class EqualityOpt {
	
	// equality operators = [ == , != ]
	// result type is boolean type only
	// 1] if we take 1st operands is boolean then 2nd take also boolean.(e.g- boolean == boolean)
	// 2] other 7 primitive type get operands (e.g - int a == float b)
	
	public static void main(String[] args) {
		
		int a =10;
		float b = 20.0f;
		boolean z = a==b;  // or System.out.println(a==b);
		System.out.println(z);
		
		boolean p = true;
		boolean q = false;
		boolean r = p!=q;  // or System.out.println(p!=q);		
		System.out.println(r);
		
		// equality in reference type
		
	   B b1 = new B();
	   C c1 = new C();
	   boolean r1 = b1==c1; // or System.out.println(b1==c1);
	   System.out.println(r1);// false
	   
	   boolean r2 = b1!=c1;
	   System.out.println(r2); // true
	   
	   A a1 = new A();
	   A a2 = a1;
	   System.out.println(a1==a2);//true
	   
	//   boolean r3 = c1==a1; ( compile time error because no relation between C class and A class)
	   
       B b2 = new B();
       B b3 = b2;
       boolean r4 = b2!=b3;
       System.out.println(r4);// false
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
}
