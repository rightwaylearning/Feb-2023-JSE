package hashcode_exp;

public class Hashcode {
	
	int a;

	public static void main(String[] args) {
		Hashcode h = new Hashcode();
		h.a=10;
		
		Hashcode h1 = new Hashcode();
		h1.a=10;
		
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		
		System.out.println(h.equals(h1));
	}
}
