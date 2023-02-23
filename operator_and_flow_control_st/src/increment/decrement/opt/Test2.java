package increment.decrement.opt;

public class Test2 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = --a + ++b + b++ + b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
