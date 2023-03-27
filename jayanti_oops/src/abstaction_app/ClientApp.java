package abstaction_app;

import java.util.Scanner;

public class ClientApp {
	
	public static void main(String[] args) {
		
		System.out.println("---Loan Service---");
		System.out.println("1. Education Loan");
		System.out.println("2. Home Loan");
		System.out.println("3. Car Loan");
		System.out.println("4. Business Loan");
		System.out.println("Please Enter The Loan Number---");
	
		Scanner sc= new Scanner(System.in);
		int loanNumber = sc.nextInt();
		
		Loan loan = null;
		
		if(loanNumber == 1) {
			loan= new EducationalLoan();
		}else if(loanNumber== 2) {
			loan = new HomeLoan();
		}else if(loanNumber == 3) {
			loan= new CarLoan();
		}else if(loanNumber == 4) {
			loan= new BusinessLoan();
		}else {
			System.out.println("Sorry");
		}
		
		if(loan != null) {
			loan.kycDetails();
			loan.myLoan();
		}
	
	}

}
