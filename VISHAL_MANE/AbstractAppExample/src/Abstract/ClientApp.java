package Abstract;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {

		System.out.println("---------Loan Service --------");
		System.out.println("1 .  Home Loan");
		System.out.println("2 .  Car Loan ");
		System.out.println("3 .  Education Loan");
		System.out.println("please enter loan number");

		Scanner sc = new Scanner(System.in);
		int LoanNumber = sc.nextInt();

		Loan Loan = null;

		if (LoanNumber == 1) {
			Loan = new HomeLoan();
		} else if (LoanNumber == 2) {
			Loan = new CarLoan();
		} else if (LoanNumber == 3) {
			Loan = new EducationLoan();
		} else {
			System.out.println("sorry....");
		}

		if (Loan != null) {
			Loan.kycDetails();
			Loan.myLoan();
		}

	}
}
