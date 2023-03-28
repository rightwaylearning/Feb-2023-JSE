package abstraction.app;

import java.util.Scanner;



public class client {
	public static void main(String[] args) {
		System.out.println("-------loan service-----");
		System.out.println("1 .   carLoan");
		System.out.println("2 .   HomeLoan");
		System.out.println("3 .   personalLoan");
		System.out.println("please enter loan no.");
		
		
		Scanner sc=new Scanner(System.in) ;
			
			int loanNumber =  sc.nextInt();
			
			Loan loan = null;
			
			if(loanNumber == 1) {
		//		loan = new carLoan();
			}else if(loanNumber ==  2) {
				loan= new HomeLoan();
			}else if(loanNumber == 3) {
		//		loan = new personalLoan();
			}else {
				System.out.println("sorry....");
			}
			
			if(loan != null) {
				loan.kycDetails();
				loan.myLoan();
		}
	
	}}

