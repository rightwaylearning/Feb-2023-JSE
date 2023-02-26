package if_conditional_operator;

import java.util.Scanner;

public class If_Positive_Negative_Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		System.out.println("Please Enter The Number :");
		number = scan.nextInt();
		
		
	
		if(number>0) {
			System.out.println("positive Number");
		}
		else if(number<0){
			System.out.println("negative Number");
			
		}
		else {
			System.out.println("Zero ");
		}
		
		
		
	}

}
