package first_project;

public class This_Reference_Variable {

	int x;
	int y;
	static int c;

	public void m1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x);
		System.out.println(y);

		System.out.println(c);

	}
	
	public static void m2() {
		System.out.println(c);
		System.out.println(c);
		
		
	}

}
