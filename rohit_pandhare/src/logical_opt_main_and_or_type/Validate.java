package logical_opt_main_and_or_type;

public class Validate {

	public boolean isValidAge(int age) {
		System.out.println("isValidAge called");
		return age >= 18;
	}
	
	public boolean isIndian(int countryId) {
		System.out.println("isIndian called");
		return countryId == 91;
	}
}
