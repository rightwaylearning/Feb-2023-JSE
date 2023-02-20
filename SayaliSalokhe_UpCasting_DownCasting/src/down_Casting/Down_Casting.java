package down_Casting;

public class Down_Casting {

	public static void main(String[] args) {
		//case:programmer is responsible to down casting 
		int a=89;      //range between 127 to -128 
		byte b=(byte)a;
		System.out.println(b);
		
		int a1=299; //when value  is not bwtn range then there may be output is not predictable   
		byte b1=(byte)a1;
		System.out.println(b1);
		
	  double d=78.89; //when value  is not bwtn range then there may be data loss problem  
	  int  i=(int)d;
	  System.out.println(i);
	//---------------------------------------------------------------------------------------------------
	  
	  
	  char c='A';
	  byte b2=(byte)c;
	  System.out.println(b2);
	  
	  char c1=(char)b2;
	  System.out.println(c1);
	}
}
