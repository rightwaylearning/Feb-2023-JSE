package break_pack;

public class Case1 {

	public static void main(String[] args) {
		
		
		// int serach(int[] arr, int targetElement)
		
		int[] arr = {10,20,56,78,90,45,37,28,52,34,5,6,8,12,34,78,34,12,21,321,45,78,900,456,23,11,22,33,44,55};
		
		int targetElement = 56;
		
		OperationOnArray opt = new OperationOnArray();
		int result = opt.serach1(arr, targetElement);
		
		System.out.println(result);
		
		
	}
}
