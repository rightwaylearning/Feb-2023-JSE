package realation;

public class Family {
	
	public void familyBusiness() {
		
		System.out.println("Cosematic item dealership");
	
	}
	
	public void businessCapital() {
		
		System.out.println("invest Rs.48.25 lakh");
	}

}

class Own extends Family{
	
	public void businessCapital() {
		
		System.out.println("invest Rs.15.45 crore");
	
	}
	public void ownBusiness() {
		
		System.out.println("Resturant");
	}
}
