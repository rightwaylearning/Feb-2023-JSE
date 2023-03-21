package abstraction_app;

abstract public class Loan {

	public void kycDetails() {
		System.out.println("KYC: Pan, Addhar, Photo Soft Copy");
	}
	
	abstract void myLoan();
}
