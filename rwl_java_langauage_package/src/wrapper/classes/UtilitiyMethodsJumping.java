package wrapper.classes;

public class UtilitiyMethodsJumping {

	public static void main(String[] args) {
		
		// 1] primitive to wrapper class object conversation
		
		     int i = 10;
		     Integer obj = Integer.valueOf(i);
		     Integer obj1 = Integer.valueOf(10);
		     // OR
		     Integer obj2 = 10; 
		     
		     
		
		   // 2] wrapper clas object into primitive
		     
		     int jj = obj.intValue();
		     
		//---------------------------------------------------------------
		     
		    // 3] convert wrapper class object into String object
		     
		     String str1 = obj.toString();
		     
		     // 4] String object into wrapper class object
		     
		     Integer iii = Integer.valueOf("10");
		     
		   //--------------------------------------------------------------     
		     
		     // 5] convert String object into primitive
		     
		        String str11 = "100";
		     
		        int oo = Integer.parseInt(str11);
		        
		        
		    // 6]
		         int yy = 10;
		         String yy1 = Integer.toString(yy);		
	}
}
