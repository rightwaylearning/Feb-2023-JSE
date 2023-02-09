package this_method;

public class This {
	
	int a;
	int b;
	static int c;
	
	public void m1 (int b) {
		
		int a =100;
		b = 10;
		this.a = b;
		b = 1;
		
		System.out.println(a);         
		System.out.println(b);          
		System.out.println(this.a);      
		System.out.println(this.b);
		
		System.out.println(c);
	}
        public static void m2() {
        	
         System.out.println(c);
        }
}
