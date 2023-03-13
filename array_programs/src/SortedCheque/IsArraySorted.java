package SortedCheque;

public class IsArraySorted {

	// sorted : - it may be ascending or descending 
	// e.g  [1,1,1,23,45,45,45,78,90] >> acs
	// e.g  [34,23,2,2,2,-8,-11] >> desc
	// e.g  [23,23,23,23,23] >> sorted
	
	public static void main(String[] args) {
		
		int[] arr = {10,23,81,99,110,123};
		
		  System.out.println(isSorted(arr));
	}
	
	static boolean isSorted(int[] arr) {
		
		if(arr[0] < arr[arr.length-1]) {
		
			for (int i = 0; i < arr.length-1; i++) {
				if(!(arr[i] <= arr[i+1])) {
					return false;
				}
			}
			
		}else if(arr[0] > arr[arr.length-1]) {
			for (int i = 0; i < arr.length-1; i++) {
				if(!(arr[i] >= arr[i+1])) {
					return false;
				}
			}
			
		}else if(arr[0] == arr[arr.length-1]) {
			for (int i = 0; i < arr.length-1; i++) {
				if(!(arr[i] == arr[i+1])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
}
