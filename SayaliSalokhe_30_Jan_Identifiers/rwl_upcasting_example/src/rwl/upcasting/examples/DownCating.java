package rwl.upcasting.examples;

public class DownCating {

	public static void main(String[] args) {
		
		
		int i = 58;
		
		byte b = (byte) i;   // -128 to +127
		
		System.out.println(b);
		
		//------------------ data loss
		
		double d = 56.89;
		
		int p = (int)d;
		System.out.println(p);
		
		// -----------------------------
		
		byte bb = 1;
		
		int ii = (int)bb;
		
		System.out.println(ii);
		//--------------------------------
		
		char ch = 'A';
		
		byte b1 = (byte)ch;
		System.out.println(b1);
		
		//-------------------------
		char ch1 = (char)b1;
		System.out.println(ch1);
		
	}
}
