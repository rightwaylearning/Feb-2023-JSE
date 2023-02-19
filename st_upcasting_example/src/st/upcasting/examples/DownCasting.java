package st.upcasting.examples;

public class DownCasting {
	
	public static void main(String[] args) {
		
	int i = 58;
	byte b = (byte)i;   // -128 to +127
	
	System.out.println(b);
 //-----------------------------------
	
	byte bb = 1;
	int ii = bb;
	System.out.println(ii);
	
	//-------------Data Loss example----------------------
	
	double d = 56.89;
	int p = (int)d;
	System.out.println(p);
	
	//-------------Down Casting Example-------------
	
	    char ch = 'A';
	    byte b1 = (byte)ch;
	    System.out.println(b1);
	    
//---------------------------------------------
	    char ch1 = (char) b1;
	    System.out.println(ch1);
	    
	}
}
