
package remove_duplicate_element;

import java.util.ArrayList;
import java.util.List;

public class CustomLogicToRemoveDuplicate {
	
	 public static void main(String[] args) {
		 
		 int[] arr= {12,54,56,67,66,67,67,65,66,98,11,12};
		 
		 List<Integer> list =new ArrayList<>();
		 
		 for(int i=0; i<arr.length; i++) {
			 if(!isExist(list, arr[i])) {
				 list.add(arr[i]);
				 
			 }
		 }
		 
		 System.out.println(list);
	 }

	 static boolean isExist(List<Integer> result, Integer element) {
		 for(Integer item: result) {
			 if(item.equals(element)) {
				 return true;
			 }
		 }
		 
		 return false;
	 }
	 
}
