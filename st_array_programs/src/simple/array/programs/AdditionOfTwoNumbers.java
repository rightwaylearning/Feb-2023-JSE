package simple.array.programs;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("please enter first number");        
	    int number1 = sc.nextInt();
	    
	    System.out.println("please enter second number");   
	    int number2 = sc.nextInt();
	    
	    int sum = number1 + number2;
	    
	    System.out.println("sum = " + sum);
		
	}

}
