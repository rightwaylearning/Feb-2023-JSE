package array_example_simple;

import java.util.Iterator;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("Enter "+i+" index element");
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("*******************************************");
	    System.out.println("Array elements are: ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    
		
	}

}
