package array_example_simple;

import java.util.Scanner;

public class Example3 {
 public static void main(String[] args) {
	int stop;
	 do
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("To check number is even or odd");
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 
	 if(num%2==0)
	 {
		 System.out.println("Number is Even");
	 }
	 else
	 {
		 System.out.println("Number is odd");
	 }
	 System.out.println("You have to Keep this process continue press 1 otherwise press 0");
	 stop=sc.nextInt();
	 
	 }while(stop!=0);
	 
	 System.out.println("Thank You");
	 
}
}
