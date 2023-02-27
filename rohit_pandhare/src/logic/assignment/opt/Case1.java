package logic.assignment.opt;

public class Case1 {
	
	public static void main(String[] args) {
		
//		int a ; declaration
		
//		int a , b,c,d ; declaration
		
		int a=32 ,b =32; //comma pn gheu shaktoh karan int doghana
//		same aasel
		
		int a1 ,b1 ,c ,v ,d;
		a1=b1=c=v=d=54;
		System.out.println(a1 + b1);
		
		int a3=1;
		a3++;
//		compiler internal aasa karte a3 = a3 +1; 
//		aasa error nahi karat compiler internal karte aasa mhnun
		
		System.out.println(a3);
		
//		but aapn jar aasa kela suppose

	      byte b3 =2;
//	      b3 = b3 + 1;
	       int b4 =b3 +1;
	       
	      
//	      asa error yete karan max formula madhe (int,byte,int)
//	      int constant ghav lagte tya mule sarv hai int temp var madhe
//	      store hote internal
//	      type mismatch: cannot convert from int to byte
	      System.out.println(b4);
	
	}

}
