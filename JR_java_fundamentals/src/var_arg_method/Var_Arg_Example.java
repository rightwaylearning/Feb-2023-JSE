package var_arg_method;

public class Var_Arg_Example {
	
	public static void main(String[] args) {
		
	int[] A1 = {10,30,60,47,76,87,99};
	
	
		int sum=0;
		int index=0;
		
		while(index < A1.length) {
			sum= sum + A1[index];
			index++;
		}
		
		System.out.println("Total ="+sum);
	}

}
