package default_values;

import java.util.Arrays;

public class Interveeiw {

	public static void main(String[] args) {
		int[] arr = {3,5,1,3,2};
		Arrays.sort(arr);
		int n = 5;
		int missedNumber = -1;
		int duplicateNumber = -1;
		
		for(int i = 1; i<=n ; i++) {
			
			if(!(i == arr[i-1])) {
				missedNumber =i;
				duplicateNumber = arr[i-1];
			}
			
		}
		System.out.println(missedNumber);
		System.out.println(duplicateNumber);
		
	}
}
