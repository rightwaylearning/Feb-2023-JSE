package this_referencevariable;

public class Test {

	int a ;
	int b ;
	
	
	void m1 (int b) {
		
		 int a = 11 ;
		b = 20 ;
		this.a = 30;
		a =this.a ;
		
		a= 12 ; 
		
		System.out.println(a) ;
		System.out.println (b) ;
		System.out.println (this.a) ;
		System.out.println (a) ;
	}

}



