package upcasting.pack;

public class Case {
public static void main(String[] args) {
		
		int i = 4242;
		long l = i;
		
		long l1 = 323L;
		
		float  f = l1;
		double d = l1;
		
		System.out.println(f);
		System.out.println(d);
		
		char ch = 'a';
		int a = ch;
		char ch1 = 'z';
		int a1 = ch1;
		
		System.out.println(a);
		System.out.println(a1);
	}


}
