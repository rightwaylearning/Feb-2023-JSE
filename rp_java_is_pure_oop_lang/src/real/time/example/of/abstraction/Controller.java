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
			
//		else madhe gela tr (Loan loan =null) value rahte aasachchya asa tya mule 
			
			System.out.println("sorry please no choose wisely");
		}
		
		
//		null jr value aasel tr tyacha (Loan loan =null) loan hai ref var aahe 
//		tyacha object nahiye tr type pn nasel mg kontya class madhun data gheil tya 
//		mule error yete 
		
//		tya mule hi condition lavav lagte
		
//		yacha aarth aasa hoto ki null == null aasla aasta tr problem zal aasta aani
//		tya madhe methodch nahiye tr run time error aala aasta 
		
//		Loan loan = null;
		
		if(loan != null) {
			
			loan.kycDetails();
			loan.myLoan();
			
		}else {
			
//			Loan loan = null ; yat yete hai 
			System.out.println("You getting null value object");
		}
		
		
		
		
		
		
		
		
		

	}

}
