package operators.and.control.flow;

public class Upcasting {
	
	public static void main(String[] args) {
		
		char ch ='$';
		
	     int f = (int)ch;
	     
//	     aasa aaste internal
		
		System.out.println(f);
		
		int a = 65;
		
		char c = (char)a;
		
		
//		aasa chalte but ya madhe data loss aani unpredictable value
//		yete memory madhe basat nasel tr
		
		System.out.println(c);

		
//		aasa chalte but ya madhe data loss aani unpredictable value
//		yete memory madhe basat nasel tr
		
		
		short s = 323;
		byte b = (byte)s;
		
		System.out.println(b);
	
//		aata ya b madhe unpredictable value aali aani data loss pn zala3
		
		int a1 = (int)433.4f;
		System.out.println(a1);
		
//		compiler check karte line by line execution aata te float chi value jari int 
//		la dili tari conversion int madhe karav lagel karan tyacha type int aahe 
		
		byte b1 = 32;
		short s1 = 12;
		
//		byte r = (byte)b1 + (byte) s1 ;
		
		boolean b4 = b1 > s1;
		
		
		
		
	
	}

}
