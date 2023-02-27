package if_conditional_operator;

import java.util.Scanner;

public class Even_Odd_Program {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter No: ");
		int no=scan.nextInt();
		
		if(no%2==0) {
			System.out.println("Even no");
		}
		else
		{
			System.out.println("Odd no");
		}
	}
}
