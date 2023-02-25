package methods_varable_acess;

public class Case1 {
 
	int p;
	int q ;
	static int r ;
	static int s ;
	
	void m1 () {
	System.out.println (p) ;
	System.out.println (q) ;
	System.out.println	(r);
	System.out.println	(s) ;
	}
	
	static void m2 () {
		
		Case1 c = new Case1 () ;
		
			System.out.println (c.p) ;
			System.out.println (c.q) ;
			System.out.println	(r);
			System.out.println	(s) ;
		
	}
	}

