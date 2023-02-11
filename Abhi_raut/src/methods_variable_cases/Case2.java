package methods_variable_cases;

public class Case2 {
	
	void m1 () {
		Case1 c = new Case1 ();
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(Case1.x);
		System.out.println(Case1.y);	
	}
      
    static void m2() {
    	
    	Case1 c = new Case1 ();
    	
    	System.out.println(c.a);
    	System.out.println(c.b);
    	System.out.println(Case1.x);
    	System.out.println(Case1.y);
    }
}
