package abstraction.app;

import java.util.Scanner;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println(" ----------loan service----------");
		System.out.println("1. Home Loan");
		System.out.println("2. Car Loan");
		System.out.println("3.   Education Loan");
		System.out.println("Enter any no for loan");
				Scanner sc= new Scanner(System.in);
		int loanNumber= sc.nextInt();
		Loan loan=null;
		if (loanNumber==1) {
			loan=new HomeLoan();
		}
		else if (loanNumber== 2) {
			loan = new CarLoan();
		}
	}else if(loanNumber==3) {
		loan = new EducationLoan();
	}
	else {
		System.out.println("sorry ...");
	}
	if (loan !=null) {
		loan.KycDeatail();
		loan.MyLoan();
	}
}
}
