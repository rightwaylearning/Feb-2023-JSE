package logical.increment.decrement;

public class Case1 {
	
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 2;
		
		int c = a++ + b-- - b++ + ++a + --a + ++b + a++ - ++a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int a1 = 2;
		
		int b1 = 1;
		
		int c1 = a1++ + ++b1 + ++a1 - --a1 + --b1 + a1-- + --b1 ;
		
		System.out.println("this is value of a1 "+a1);
		
		System.out.println("this is value of b1 "+b1);
		
		System.out.println("this is value of c1 "+c1);
		
		
	}

}
