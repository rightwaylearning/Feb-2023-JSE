package abstraction_application;

import java.util.Scanner;

public class ClientApp {
	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("--------------Loan Services---------------");
			System.out.println("1. Home Loan");
			System.out.println("2. Car Loan");
			System.out.println("3. Education Loan");

			System.out.println("Please enter the number for Loan");

			Scanner sc = new Scanner(System.in);
			int loanNumber = sc.nextInt();

			Loan loan = null;

			if (loanNumber == 1) {
				loan = new HomeLoan();
			} else if (loanNumber == 2) {
				loan = new CarLoan();
			} else if (loanNumber == 3) {
				loan = new Education();
			} else {
				System.out.println("Sorry..........");
			}

			if (loan != null) {
				loan.KYC();
				loan.myLoan();
			}
			System.out.println("You have to check other loan details then press 1 otherwise 0 ");
			choice = sc.nextInt();
		} while (choice != 0);
		System.out.println("--------Thank you---------");

	}

}
