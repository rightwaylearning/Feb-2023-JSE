package simple.array.program;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		
		while(b) {
			
			System.out.println("please enter number");
			
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("Given Number is Even");
			}else {
				System.out.println("Given Number id Odd");
			}
			
		}
		
		
	}
}
