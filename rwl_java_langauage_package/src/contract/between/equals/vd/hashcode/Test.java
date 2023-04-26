package contract.between.equals.vd.hashcode;

import java.util.HashSet;

class Profile{
	private Integer profileId;
	private String candidateName;
	private Integer sequenceNo;
	
	public Profile() {}

	public Profile(Integer profileId, String candidateName, Integer sequenceNo) {
		super();
		this.profileId = profileId;
		this.candidateName = candidateName;
		this.sequenceNo = sequenceNo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("I am equals");
		if(this ==  obj) {
			return true;
		}
		
		if(obj instanceof Profile) {
			Profile p = (Profile)obj;
			
			if(this.profileId.equals(p.profileId)
			  && this.candidateName.equals(p.candidateName)
			  && this.sequenceNo.equals(p.sequenceNo)) {
				return true;
			}
			
		}
		
		
		return false;
	}
	

	@Override
	public int hashCode() {
		System.out.println(" I am HashCode");
		return this.profileId.hashCode() + this.candidateName.hashCode() + this.sequenceNo.hashCode();
	}
	
}



public class Test {

	public static void main(String[] args) {
		// case 1
//		Profile p1= new Profile(121,"A", 34);
//		Profile p2= new Profile(121,"A", 34);
//		
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.hashCode() == p2.hashCode());
		
		
		// case 2
		
//		Profile p1= new Profile(121,"A", 34);
//		Profile p2= new Profile(34,"A", 121);
//		
//		System.out.println(p1.equals(p2));   // false
//		System.out.println(p1.hashCode() == p2.hashCode());  // false OR true
		
		
		// case 3
		
		// case 4 & 3
//		Profile p1= new Profile(121,"A", 34);
//		Profile p2= new Profile(121,"A", 34);
//		
//		System.out.println(p1.hashCode() == p2.hashCode()); // true
//		System.out.println(p1.equals(p2));
		
		//---------------------------------
	
		
	}
}





