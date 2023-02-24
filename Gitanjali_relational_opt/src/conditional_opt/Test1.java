package conditional_opt;

public class Test1 {
	public static void main(String[] args) {
		int a = 400;
		int b = 800;
		int c = 300;
		if (a > b && a > c) {
			System.out.println("a is big element" + a);
			if (b > a && b > c) {
				System.out.println("b is big element");
				 {
					System.out.println("c is big element" +c);
				}
			}
		}
	}
}