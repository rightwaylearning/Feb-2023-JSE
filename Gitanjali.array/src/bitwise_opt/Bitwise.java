package bitwise_opt;

public class Bitwise {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		if (b < a && ++a > 100) {
			a++;
		} else {
			b++;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
