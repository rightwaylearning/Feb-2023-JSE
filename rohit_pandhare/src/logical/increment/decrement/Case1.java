package logical.increment.decrement;

public class Case1 {
	
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 2;
		
		int c = a++ + b-- - b++ + ++a + --a + ++b + a++ - ++a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
