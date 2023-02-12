package method.call.rule;

public class B {
	
	int x;
	int y;
	
	void k1() {
		System.out.println("I am k1 method");
		  k2();
		
	}
      
	 void k2() {
		 System.out.println("I am k2 method");
		 
	 }
	 
	  public static void main(String[] args) {
		  B b = new B();
		    b.k1();
	}
}
