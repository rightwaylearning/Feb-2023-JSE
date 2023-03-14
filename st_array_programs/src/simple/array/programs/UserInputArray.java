package simple.array.programs;

import java.util.Scanner;

public class UserInputArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		    //OR
		
		int[] arr1 = new int[5];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//-------------OR-------------------
		
		Scanner sc = new Scanner(System.in);
		   System.out.println("tell me size of array");
		   
		     int size = sc.nextInt();
		      
		     int[] arr2 = new int[size];
		     
		     for (int i = 0; i < arr2.length; i++) {
		    	 System.out.println("please enter "+ i +"th index element");
		    	 arr2[i] = sc.nextInt();
		    	 
		     }
		     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		     
		     for (int i = 0; i < arr2.length; i++) {
		    	 System.out.print(arr2[i] + "  ");
				
			    }
	          }
            }        
