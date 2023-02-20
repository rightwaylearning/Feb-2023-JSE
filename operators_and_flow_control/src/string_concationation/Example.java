package string_concationation;

public class Example {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = " good morning";
		String r = s1 +s2;
		System.out.println(r);
		//---------------------------------------------------
		
		String r1 = "Hello" + " good morning";
		System.out.println(r1);
		//--------------------------------------------
		
		String r2 = "ans= " + 23;
		System.out.println(r2);
		
		//---------------------------------------
		
		String name ="Suraj";
		int age = 23;
		
		System.out.println("Student name = "+name);
		System.out.println("Student age = "+ age);
		
		//-------------------------------------------
		
	    String str = 10 + 20 + "10" + 20 + 90;
	    System.out.println("final result "+ str);
		
	    //-----------------------------------------
	    System.out.println(6+6+6+6); // 24
	    System.out.println("6"+6+6+6); // "6666"
	    System.out.println(6+6+6+"6"); // "186"
	    System.out.println(6+6+"6"+6); // "1266"
	    
	    int a = 10;
	    int b = 20;
	    String c= "30";
	    String  r22 = a + b +c;    
        System.out.println(r22);
        
        System.out.println("" + 10 +true+10.23+'A');
	}
	
}



