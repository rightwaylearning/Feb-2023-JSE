package relational.operators;

public class ArithmaticOpt1 {
          public static void main(String[] args) {
			
        	  byte b = 10;
        	  byte a = 20;
        	   
        	  int r = a + b;  // max(int, byte, byte) = int
         //-----------------------------------------------	  
        	  short s = 45;
        	  short s1 = 45;
        	  
        	  int r2 = s + s1; // max(int, short, short) = int
        //-----------------------------------------------------------	  
        	  int a1 = 10;
        	  int b1 = 20;
        	  
        	  int r3 = a1 + b1; 
      //  ----------------------------------------------	  
        	 int a2 = 25;
        	 int b2 = 2;
        	 
        	 int r4 = a2/b2;    // max(int, int, int) = int
        	 System.out.println(r4);
      //--------------------------------------------------------
        	 int a3 = 25;
        	 double b3 = 2.0;
        	 
             double r5 = a2/b2;    // max(int, int, double) = double
        	 System.out.println(r5);
        	 
       //--------------------------------------------------------
        	 int r6 ='A' * 2;
        	 System.out.println(r6);
		}
}
