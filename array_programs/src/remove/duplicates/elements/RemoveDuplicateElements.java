package remove.duplicates.elements;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int[] arr = {12,67,12,34,2,1,8,2,1,12,1};
		printArray(arr);
		// logic
		//---------------
		  Set<Integer> set  = new LinkedHashSet<>();
		  for(int i: arr) {
			  set.add(i);
		  }
		Object[] objectArr = set.toArray();
		
		int[] targetArray = new int[objectArr.length];
		
		for (int i = 0; i < objectArr.length; i++) {
			targetArray[i]= (Integer)objectArr[i];
		}
		
		arr = targetArray;
		
		//---------------------
		printArray(arr);	
		
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
}
