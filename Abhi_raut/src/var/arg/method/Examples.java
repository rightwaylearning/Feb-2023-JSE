package var.arg.method;

public class Examples {
    
	public void sum(int... add) {
		
		int index = 0;
		int sum = 0;
		
		while(index<add.length) {
			
			sum = sum + add[index];
			index++;
		}
		   System.out.println("Addition = "+sum);
	}
	
	/*public void reverse(int... r) {
		
		int index = 0;
		
		 while(0<r.length) {
			 
			 System.out.println("Revrese = "+ r[r.length-1] );
			   index++ ;
		 }*/
	
	   public void even(int... add) {
		   
		  int i = 0;
		 
		  while(i<add.length) {
				  i++;
			 if(add[i]%2!=1) {
			 System.out.println(add[i]);
		  }
	  }	
   }
	   public void odd(int... add) {
		   
		   int j = 0;
		   while(j<add.length) {
			   j++;
			 if(add[j]%2==1)  {
				 System.out.println(add[j]);
			 }
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
}
	

