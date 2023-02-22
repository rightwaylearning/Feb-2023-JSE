package logical.opt;

public class Validate {
	

		
		public boolean isValidAge(int age) {
			System.out.println("isValidAge Called");
			return age >=18;
		}
		
		public boolean isIndian(int countryId) {
			System.out.println("isIndian Called");
			return countryId == 91;
		}
		
	}

