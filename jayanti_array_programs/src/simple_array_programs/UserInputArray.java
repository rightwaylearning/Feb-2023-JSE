package simple_array_programs;

import java.util.Scanner;

public class UserInputArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//or
		
		int[] arr1 = new int[5];
		
		arr1[0] =10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
	
	//...........................................	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell me array size");
		
		int size = sc.nextInt();
		
		int[] arr2 =new int[size];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Please Enter"+i+"th Index Element");
			arr2[i] =sc.nextInt();
		}
		
		System.out.println(".......");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i] + "");
		}
		
		
		
		
		
		
		
	}
}
