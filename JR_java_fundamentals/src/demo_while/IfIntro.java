package demo_while;

import java.util.Scanner;

public class IfIntro {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num;
		System.out.println("Enter the no: ");
		num=scan.nextInt();
		
		
		if(num>0) {
			System.out.println("Positive no");
		}
		else {
			System.out.println("Negative no");
		}
		
		
	}

}
