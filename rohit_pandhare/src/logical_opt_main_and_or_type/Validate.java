package logical_opt_main_and_or_type;

public class Validate {

	public boolean isValidAge(int age) {
		
		boolean r =  age >= 18;
		
		System.out.println("isValidAge called");
		return r;
	}
	
	public boolean isIndian(int countryId) {
		
		boolean r =  countryId == 91 ;
		 
		System.out.println("isIndian called");
		
		return r;
	}
}
