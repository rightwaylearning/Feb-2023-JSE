package increment.decrement.opt;

public class Practice {
	
	public static void main(String[] args) {
		
	
	
	int a = 10;
    int b = 20;
    int c = --a + ++b + b-- + b++;  
    
    // a = 10 - 1 = 9           
    // b = 20 + 1 = 21
    // b = 21 - 1 = 20
    // b = 20 + 1 = 21
   
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	}
	
}
