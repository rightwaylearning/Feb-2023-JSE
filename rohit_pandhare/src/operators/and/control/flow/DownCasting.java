package operators.and.control.flow;

public class DownCasting {
	public static void main(String[] args) {
		
		byte i2 = 4;
		
		int i3 = (int)i2;
		
		System.out.println(i3);
//		 ya madhe value barobr yete but internal changes aase hotat
		
		int i = 134;
		
		byte b = (byte) i;
		
		System.out.println(b);
		
//		aasa karu shaktoh but ya madhe unpredictable value aali 
		
		
		float f = 43.43f;
		
		int i1 = (int) f;
		
		System.out.println(i1);
		
//		ya madhe ans 43 yete karan int aahe na aata data loss hoto
		
		
		char ch = 'a';
		int a = (int) ch;
		
		char ch1 = (char) a ;
		
		System.out.println(a);
		System.out.println(ch1);
		
	}

}
