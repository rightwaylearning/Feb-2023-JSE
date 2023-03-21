package abstraction_app;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		
		System.out.println("---------Loan Service---------");
		System.out.println("1. Home Loan");
		System.out.println("2. Car Loan");
		System.out.println("3. Education Loan");
		System.out.println("Please Enter Loan Number");
		
		
		Scanner sc = new Scanner(System.in); 
		   int loanNumber = sc.nextInt();
		   
		   Loan loan = null;
	 
            if(loanNumber == 1) {
            	loan = new HomeLoan();
            	
            }else if (loanNumber == 2) {
            	loan = new CarLoan();
            	
            }else if(loanNumber == 3) { 
            	loan = new EducationLoan();
                 	
            }else {
            	System.out.println("Sorry");
            }
            if(loan != null) {
            	loan.kycDetails();
            	loan.myLoan();
            	
            }
	      }
        }
