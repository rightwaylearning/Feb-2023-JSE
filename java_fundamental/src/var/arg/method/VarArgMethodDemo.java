package var.arg.method;

public class VarArgMethodDemo {

	// var-arg method
	void add(int... product) {
		
      int index =0 ;
      int sum = 0;
      
      while(index < product.length) {
    	  sum = sum + product[index];
    	  index++;
      }
	
      System.out.println("Total = "+ sum);
	}
}










