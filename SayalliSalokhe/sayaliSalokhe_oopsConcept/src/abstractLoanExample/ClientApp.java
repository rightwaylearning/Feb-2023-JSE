package abstractLoanExample;

import java.util.Scanner;

public class ClientApp {
	
	public static void main(String[] args) {
		
		System.out.println("Select your loan type:");
		System.out.println("1.Home loan");
		System.out.println("2.Education Loan");
		System.out.println("3.Car Loan");

		System.out.println("Enter your loan type:");

		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();

		MyLoan loan1=null;

		if (result == 1) {
			loan1=new HomeLoan(); 

		} else if (result == 2) {
			loan1 = new EducationLoan();

		} else if (result == 3) {
			loan1=new Car_loan();

		} else {
			System.out.println("you not valide for loan");
		}
		if (loan1 != null) {
			loan1.Kycdetails();
			loan1.MyLoan1();
		}
	}

}
