package simple_array_programs;

public class ArrayCopyOpt {
	
	int returnSizeOfEvenElemnet(int[] array) {
		int size = 0;
		
		for (int i =0; i<array.length; i++) {
			if(array[i] %2==0) {
				size++;
			}
		}
		return size;
		
	}
	
	int[] copyArray(int[] inputArray, int[] outputArray) {
		
		int index=0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] % 2 == 0) {
			outputArray[index]=inputArray[i];
			index++;
			}
		}
		
		return outputArray;
		
	}
	
	void printArray(int[] arr) {
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		}
	}
}
