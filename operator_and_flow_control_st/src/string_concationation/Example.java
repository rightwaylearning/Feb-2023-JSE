package string_concationation;

public class Example {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = " Good Morning";
		String r = s1 + s2;
		System.out.println(r);
		
		//===============================================
		
		String r1 = "Hello" + "Good Morning";
		System.out.println(r1);
		
		//============================================
		
		String r2 = "ans= " + " 23";
		System.out.println(r2);
		
		//====================================================
		
		String name = "Swapna";
		int age = 23;
		
		System.out.println("Student name = "+name);
		System.out.println("Student age = "+age);
		//=======================================================
		
		String str = 10 + 20 + "10" + 20 + 90;
		
		         // left to right
		         //= 30 + "10" + 20 + 90;
		         //= "3010" + 20 + 90;
		         //= "301020" + 90;
		         // = "30102090";
		
		System.out.println("final result = " + str);
		
		//===========================================================
		
		System.out.println("result =" +6+6+6+6);
//------------------------------------------------------------------------
		System.out.println("result = " + "6"+6+6+6);
		                            // "6"+6+6+6;
		                            // "66"+6+6;
		                            // "666"+6;
		                            // "6666";
//-----------------------------------------------------------------
		System.out.println("result = " +6+6+6+"6");
		                          //  12+6+"6"
		                          //   18+"6"
		                          //     "186"
//------------------------------------------------------------------
		System.out.println("result = " + 6+6+"6"+6);
		                         // 12+"6"+6
		                         // "126"+6
		                         // "1266"
//---------------------------------------------------------------------
		int a = 10;
		int b = 20;
		String c = "30";
		String r22 = a + b + c;
		System.out.println("result = "+r22);
		
		// 10+20+"30"
		// 30+"30"
		// "3030"

//----------------------------------------------------------------
     System.out.println(""+ 10 + true +10.23 + 'A');		
		
		
		                    

	}

}
