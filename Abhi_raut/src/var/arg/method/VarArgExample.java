package var.arg.method;

public class VarArgExample {
      
	public static void main(String[] args) {
		
		int[] arr = {10,25,45,546,4,58,62,562,42,48,152,2};
		
		int index = 0;
		int multiply = 1;
		
		while(index < arr.length) {
			
			multiply = multiply * arr[index];
			index++;	
			
		}
		
		 VarArg a = new VarArg();
			
		a.multiply(10,20,30,40,100,200);//
			
		
		
		 
		  
		 
	}
}
