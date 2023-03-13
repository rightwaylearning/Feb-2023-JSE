package simple_array_programs;

import java.util.Scanner;

public class EvenAndOdd {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		boolean b= true;
		
		while(b) {
			
			System.out.println("please Enter the Number");
			
			int num= sc.nextInt();
			
			if(num % 2==0) {
				System.out.println("Given number is even");
			}else {
					System.out.println("Given number is odd");
					
					
				}
			}
		}
	}


