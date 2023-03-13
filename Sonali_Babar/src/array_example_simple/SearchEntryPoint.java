package array_example_simple;

import java.util.Scanner;

public class SearchEntryPoint {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SearchNumber obj=new SearchNumber();
		
		int[] arr= {20,30,40,50,70,90};
		System.out.println("Enter Search Number ");
		int num=sc.nextInt();
		obj.arrayElement(arr,num);
		
		
	
	
		
	}

}
