package remove_duplicate_element;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {
	
	
	public static void main(String[] args) {
		
		int[] arr= {12,77,877,77,76,6,43,43,44,55,66,66,12};
		printArray(arr);
		
		//logic
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		
		Object[] objectArr = set.toArray();
		
		int[] targetArray = new int[objectArr.length];
		
		for(int i=0; i<objectArr.length; i++) {
			targetArray[i]= (Integer)objectArr[i];
		}
		
		arr=targetArray;
		
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		
		
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i] +" ");
	}
		System.out.println(" ");
		
	}

}
