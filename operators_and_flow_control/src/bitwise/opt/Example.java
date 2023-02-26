package bitwise.opt;

public class Example {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		System.out.println(b < a ^ ++a < 10);
		
		

		if (b < a & ++a > 10) {
			a++; 

		} else {
			b++;
		}

		System.out.println(a);// 11
		System.out.println(b); // 21
		
		
		
	}
}
