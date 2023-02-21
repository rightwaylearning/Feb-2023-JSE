package test;

public class Test {
	static int a=10;
	static int b=20;
	
	public static boolean exp1() {
		return a+10==b;
	}
	public static boolean exp2() {
		return b == 20;
	}
	public static void main(String[] args) {
		if (Test.exp1() && Test.exp2()) {
			System.out.println("True Part");
		}else {
			System.out.println("False Part");
		}
	}
}
