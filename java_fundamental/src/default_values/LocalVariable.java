package default_values;

public class LocalVariable {

	public static void main(String[] args) {
		
		int i;
		int j = 10;
		System.out.println(j);
		
		LocalVariable obj = new LocalVariable();
		obj.m1();
	}
	
	void m1() {
		int a;
		int b;
		System.out.println(a);
		System.out.println(b);
		
		String str = new String();
		System.out.println(str);
	}
	
}

// there is no any default values for local variable
// if u want to use ,then before use need to init with some value


