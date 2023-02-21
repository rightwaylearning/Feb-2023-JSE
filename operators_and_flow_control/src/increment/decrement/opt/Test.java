package increment.decrement.opt;

public class Test {

	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		
		int c = --a + ++b + b++ + b--;
		
		System.out.println(a); //9
		System.out.println(b); // 21
		System.out.println(c);// 73
		
	}
}
