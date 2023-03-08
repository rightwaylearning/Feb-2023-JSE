package remove.duplicates.elements;

import java.util.ArrayList;
import java.util.List;

public class CustomLogicToRemoveDuplicates {

	
	
	public static void main(String[] args) {
		

		int[] arr = {12,67,12,34,2,1,8,2,1,12,1};
		
		List<Integer> list = new ArrayList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!isExist(list, arr[i])) {
				list.add(arr[i]);
			}
		}
		
		System.out.println(list);
	}
	
	static boolean isExist(List<Integer> result , Integer element) {
		
		for (Integer item : result) {
			if(item.equals(element)) {
				return true;
			}
		}
		
		return false;
	}
}
