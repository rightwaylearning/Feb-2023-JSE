package break_pack;

public class Case3 {
	
	public static void main(String[] args) {
		
	   for(int i = 1; i<=3; i++) {
		
		   for(int j = 0; j<=3; j++) {
			   if(i != j) {
			   System.out.println("("+i+" "+j+")");
		   }else {
			  break;
			  
		   }
	   }
	   }
	   
	   System.out.println("here is End line of method");
	}

}
