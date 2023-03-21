package priciples.java;

public class finalOutput {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.homeConstruction();
		p1.bankBalance();
		// p1.ownBuisness();

		child c2 = new child();
		c2.homeConstruction();
		c2.bankBalance();
		c2.ownBuisness();
		
		Parent p3=new child();
		p3.homeConstruction();
		p3.bankBalance();
		// p3.ownBuisness();
		

	}
}
