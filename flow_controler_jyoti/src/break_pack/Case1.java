package break_pack;

public class Case1 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,56,78,90,45,37,28};
		int targetElement = 56;
		
		OperationOnArray opt = new OperationOnArray();
		int result = opt.serach(arr, targetElement);
		
		System.out.println(result);
		
		
	}
	
}
		

