package simple.array.program;

import java.util.Scanner;

public class additionOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number");
	    int number1 = sc.nextInt();
	    
	    System.out.println("please neter second number");
	    int number2 = sc.nextInt();
	    
	    int sum = number1 + number2;
	    
	    System.out.println("sum = " + sum);
		
		
	}
}
