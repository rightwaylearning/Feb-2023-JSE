package methods_variable_access;

public class Case2 {
	
	void c1() {
		Case1 c = new Case1();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(Case1.m);
		System.out.println(Case1.n);
	}
      static void c2() {
    	  Case1 c = new Case1();
  		System.out.println(c.x);
  		System.out.println(c.y);
  		System.out.println(Case1.m);
  		System.out.println(Case1.n);	  
      }
      
      public static void main(String[] args) {
    	  Case1 c = new Case1();
    		System.out.println(c.x);
    		System.out.println(c.y);
    		System.out.println(Case1.m);
    		System.out.println(Case1.n);
	}
		   
	}

