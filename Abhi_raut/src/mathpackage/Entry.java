package mathpackage;

public class Entry {
	public static void main(String[] args) {
		
		Cal c = new Cal();
		c.a=25;
		c.b=5;
		int v =c.sum();
		int n = c.multiply();
		
		System.out.println(v);
		System.out.println(n);
		
	}

}
