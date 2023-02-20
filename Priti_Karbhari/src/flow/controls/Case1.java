package flow.controls;

public class Case1 {
	int a ;
	int b;
		static int i;
		
		boolean b() {
			
			boolean c = a>b;
			 
			return c;
		}
		
		 int m() {
//	       this is ref var hai automatic jenva aapn object chya mule
//	     method call kartoh hai this ref. variable create hote
	   	 
			 int s1 = a + b;
//	   	System.out.println(this.a);
	   	return s1;
	   	
	   }
		
	    float m1() {
//	        this is ref var hai automatic jenva aapn object chya mule
//	      method call kartoh hai this ref. variable create hote
	    	 int a =12;
	    	   int b= 34;
	    	
	    	float s = a + b;
//	    	System.out.println(this.a);
	    	return s;
	    	
	    }
	    
	    void m2(int a, int b) {

//	    	a = 10;
	    	
	    	System.out.println(a);
	    	
	    	
	    }

	    void m3(int a, int b) {

//	    	b = 11
	    	
	    	System.out.println(b);
	    	
	    	
	    }

}
