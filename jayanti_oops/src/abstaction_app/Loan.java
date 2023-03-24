package abstaction_app;

abstract public class Loan {
	
	public void kycDetails() {
		System.out.println("kyc: Pan-Card, Aadhar-Card, 2 Passport size Photo");
	}
	
	abstract void myLoan();
}
