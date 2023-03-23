package abstraction;

import java.util.Scanner;

public class LoanApprovalManager {

	public static void main(String[] args) {

		System.out.println("------------Loan Type------------");
		System.out.println("1. Agricultural Loan");
		System.out.println("2. Business Loan");
		System.out.println("3. Personal Loan");
		System.out.println("please select Loan type by number");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		Loan loan = null;

		if (number == 1) {
			loan = new AgriLoan();
			System.out.println("............req.documents for Agricultural Loan................");
		} else if (number == 2) {
			System.out.println("............req.documents for Business Loan................");
			loan = new BusinessLoan();
		} else if (number == 3) {
			System.out.println("............req.documents for Personal Loan................");
			loan = new PersonalLoan();
		} else {
			System.out.println("Sorry.....");
		}

		if (loan != null) {
			loan.kyc();
			loan.myLoan();
		}
	}

}
