package EqualityOpt;

class A{
	
}

class B{
	
}

class C extends B{
	
}

public class Examples {
	
	public static void main(String[] args) {
		
		A a1= new A();
		A a2= new A();
		
		boolean r1= a1==a2;
		
		System.out.println(r1);
		
		B b1 = new B();
		B b2= b1;
		
		boolean r2= b1==b2;
		
		System.out.println(r2);
		
		A a3= new A();
		Object o2= new Object();
		
		boolean r3= a3==o2;
		
		System.out.println(r3);
		
		 C c = new C();
	     B b= new B();
	     
	     boolean r4= c==b;
	     
	     System.out.println(r4);
	     
	     C c1= new C();
	     A a7= new A();
	     
	     //here there is a no realtionship between C & A
	     
	     //boolean r5= c1==a7;
	     
	     //-----------------------------------
	     
	     C c9= new C();
	     Object o7 = new Object();
	     System.out.println(c9==o7);
	    	
	}

}


