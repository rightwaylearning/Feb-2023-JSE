package array_opt_com;

import java.util.Scanner;

public class Even_Num_Array_Sort {
	
	public int[] getarry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while (i < arr.length) {
			System.out.println("Enter " + i + " th arr element ");
			int num = sc.nextInt();
			arr[i] = num;
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		return arr;
	}

}
