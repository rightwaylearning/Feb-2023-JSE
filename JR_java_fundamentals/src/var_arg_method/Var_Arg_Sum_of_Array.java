package var_arg_method;

public class Var_Arg_Sum_of_Array {
	
	public static void main(String[] args) {
		int[] A1 = {50,6,7,87,88,99,56,45,33,22,44,55,66,66,77};
		int sum = 0;
		int index = 0;
		
		while(index< A1.length) {
			sum = sum +A1[index];
			index++;
			
		}
		
		System.out.println("total ="+sum);
		
		
		
	}

}
