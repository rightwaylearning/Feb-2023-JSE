package default_values;

public class LocalVariable {
	
	public static void main(String[] args) {
		
		int i;
		int j= 10;
		System.out.println(j);
		LocalVariable obj= new LocalVariable();
		obj.m1(10,20);
	}
	
<<<<<<< HEAD
	void m1() {
		int a = 30;
		int b = 20;
=======
	void m1(int a, int b) {
		int a1;
		int b1;
>>>>>>> 8bde6db531965f2dda0aaae705e574de20e3b7e5
		System.out.println(a);
		System.out.println(b);
		
		String str = new String();
		System.out.println(str);
	}
	
}

// there is no any default values for local variable
// if u want to use ,then before use need to init with some value


}
