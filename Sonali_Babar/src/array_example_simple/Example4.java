package array_example_simple;

import java.util.Scanner;

public class Example4 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+"th Index Element");
			arr[i]=sc.nextInt();
		}
		System.out.println("**********************");
		
		System.out.println("Array Element are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("**********************");
		System.out.println("Even Numbers In array are");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(" "+arr[i]);
			}
		}
		
		
	}

}
