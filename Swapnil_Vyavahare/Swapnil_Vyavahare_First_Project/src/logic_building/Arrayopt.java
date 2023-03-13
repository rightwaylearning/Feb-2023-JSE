package logic_building;

public class Arrayopt {
	public  int getSizeOfEvenElement(int[] arr) {

		int size = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				size++;
			}

		}

		return size;
	}

	public int[] copyArray(int[] inputarray, int[] outputarray) {

		int index = 0;
		for (int i = 0; i < inputarray.length; i++) {

			if (inputarray[i] % 2 == 0) {

				outputarray[index] = inputarray[i];
				index++;
			}

		}

		return outputarray;
	}
	
void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
