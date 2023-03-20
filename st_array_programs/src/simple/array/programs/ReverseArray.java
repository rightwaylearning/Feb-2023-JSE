package simple.array.programs;

public class ReverseArray {
	
public static void main(String[] args) {
		
		int[] inputArray = {10,20,30,40,50};
		printArray(inputArray);
		int[] secondArray = new int[inputArray.length];
		
//		for (int i = 0; i < inputArray.length; i++) {
//			secondArray[i] = inputArray[inputArray.length-1-i];
//		}
		int j =0;
		for(int i = inputArray.length -1 ; 0 <= i; i--) {
			secondArray[j] = inputArray[i];
			j++;
		}
		
		printArray(secondArray);
	}
	
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
