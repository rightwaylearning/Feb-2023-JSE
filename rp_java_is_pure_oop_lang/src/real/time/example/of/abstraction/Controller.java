package real.time.example.of.abstraction;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {

		System.out.println("Documents required for loan As follows");

		System.out.println("1. Home Loan");

		System.out.println("2. Car Loan");

		System.out.println("3. Bussiness Loan");

		System.out.println("Please hit the no to know the documents are requires");

		
//		home loan rahudya car loan rahudya sarglyache document vegle vegle aahet 
//		te aaplyala mahiti nahi tyamule myLoan documents hai vegla ghetla
		
//		aani tyala abstract kela 
		
//		Loan loan = new HomeLoan();
//		
//		Loan loan1 = new CarLoan();
//		
//		Loan loan2 = new BussinessLoan();
//		

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		Loan loan = null;

		if (no == 1) {

			System.out.println("Thank You For applying here Your Homeloan Documents are");
			loan = new HomeLoan();

		}
		else if (no == 2) {


			System.out.println("Thank You For applying here Your Carloan Documents are");
			loan = new CarLoan();

		}
		else if (no == 3) {


			System.out.println("Thank You For applying here Your Bussinessloan Documents are");
			loan = new BussinessLoan();

		}
		else {
			System.out.println("sorry please no choose wisely");
		}
		
		
//		yacha aarth aasa hoto ki null == null aasla aasta tr problem zal aasta aani
//		tya madhe methodch nahiye tr run time error aala aasta 
		
		if(loan != null) {
			
			loan.kycDetails();
			loan.myLoan();
			
		}else {
			System.out.println("You getting null value object");
		}
		
		
		
		
		
		
		
		
		

	}

}
