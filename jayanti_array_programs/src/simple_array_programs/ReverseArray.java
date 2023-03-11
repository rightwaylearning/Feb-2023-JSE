package simple_array_programs;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] inputArray = {10,20,30,40,50} ;
		System.out.println("Orignal Array: ");
		printArray(inputArray);
		int[] secondArray = new int[inputArray.length];
		
		
		for(int i=0; i<inputArray.length; i++) {
			secondArray[i] = inputArray[inputArray.length-1-i];
		}
		
		System.out.println("Reverse Array: ");
		printArray(secondArray);
	}
	
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		}
		System.out.println();
	}
}
