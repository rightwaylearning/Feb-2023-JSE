package increment.decrement.opt;

public class Test {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a--; 
		System.out.println(a);
		
		int a1 =10;
		int b1 = 20;
		
		int c = --a + ++b + b++ + b--;
		
		System.out.println(a); //9
		System.out.println(b); // 21
		System.out.println(c);// 73
		
	}
}
