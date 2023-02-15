package up.casting;

public class UpCasting {
	public static void main(String[] args) {
		
		// Up Casting - boolean not allow
		//        byte  --> short --> int -->long --> float --> double
		//                           |
		//                         char
	
		
		int a = 10;
	//	short s = a;   cannot convert from int to short
		
		short s = 5;
		int c = s;
		System.out.println(c);
		
		
		byte b = 1;
		short z = b;
		System.out.println(z);
		
		short s1 =10;
	//  byte b1 = s1;  cannot convert from short to byte
		
		
		char q = 'A';
		int s2 = q;
		System.out.println(s2);
		
		int s3 = 6528;
		long l = s3;
		System.out.println(l);
		
		long l1 = 589756;
	//	int v = l1;   not convert long to int 
		
			}

}
