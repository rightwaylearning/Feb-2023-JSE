package if_else_Select_Statments;

public class IfElseAssingment4 {
	public static void main(String[] args) {
		
		/*
		 * int a=10;
		 *  if(a==10); 
		 * System.out.println("hiiiii");
		 *  else // token "else",
		 * delete this token
		 *  {
		 *   System.out.println("heloo");
		 *    }
		 */
		
		//--------------------------------------------------------------------------
		int a=10;
        if(a==10);  //if you don't take any statement after decaration then it run blank 
        else;
        System.out.println("i am extra part");
		
        //--------------------------------------------------------------------------
       boolean b1=true;
       if(b1=false);else;
       System.out.println("i am extra part");
       
       //---------------------------------------------------------------------------
       
       boolean b2=false;
       if(b2=false);else;
       {
    	   boolean b4=false;
    	   System.out.println("i am block part");
       }
       System.out.println("i am true");
	}


}
