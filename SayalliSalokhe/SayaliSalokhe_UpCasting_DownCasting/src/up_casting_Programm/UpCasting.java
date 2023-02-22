package up_casting_Programm;

public class UpCasting {
	public static void main(String[] args) 
	{
		
     //Case1:-it print ASCII Value of A
	 char ch='A';
	 int a1=ch;
	 System.out.println(a1);
	
	 //Case2:-Type mismatch: cannot convert from int to short  it compiler support upcasting.
	 
	   /*  char-->int-->long-->float-->double
	               ^
    byte-->short---|  */
	 
	 byte a=10;
	 int b=a;
	 int  m=300;
	// short s1=m; 
	 
	 
	
	}

}
