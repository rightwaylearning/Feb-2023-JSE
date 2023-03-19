package realation;

public class FamilyControl {

	public static void main(String[] args) {
		 
		// case-1
		
		Family f= new Family();
		
		f.familyBusiness();
		f.businessCapital();
	//	f.ownBusiness();
		
		System.out.println("...........................");
		
		// case-2
		
		Own o = new Own();
		
		o.ownBusiness();
		o.businessCapital();
		o.familyBusiness();
		
		System.out.println(".............................");
		
		// case-3
		
		Family f1 = new Own();
		
		f1.familyBusiness();
		f1.businessCapital();
		
		
		
	}
}
