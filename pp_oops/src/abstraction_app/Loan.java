package abstraction_app;

abstract public class Loan {
   public void kycDetails () {
	  System.out.println("KYC:Pan,Adhaar,pan soft copy"); 
   }
   abstract void myLoan();
}
