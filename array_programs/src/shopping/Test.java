package shopping;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		//int[] arr = {10,23,27,23,30,89};
		int[] arr = {23,69,90,67,90,21};
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i = 0 ;i < arr.length ; i = i+2) {
			
			sum = sum + (arr[i+1] - arr[i]);
		}
		
		System.out.println(sum);
		
	}
}
