package var.arg.method;

public class VarArg {
     // var-arg method 
		
	public void multiply(int... arr) {
		
		int index = 0;
		int multiply = 0;
		
		while(index< arr.length) {
			multiply = multiply * arr[index];
			index++;
		}
		  System.out.println("total = "+ multiply);
	}
	
	
}
