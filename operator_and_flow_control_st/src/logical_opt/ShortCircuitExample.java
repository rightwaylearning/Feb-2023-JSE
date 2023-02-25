package logical_opt;

public class ShortCircuitExample {
	 
	public static void main(String[] args) {
		
		Validate v = new Validate();
		
		if(v.isValidAge(32) && v.isIndian(91)) {
			 System.out.println("please alloew him for voter id card");
		}else {
			System.out.println("sorry");
		}
	}

}
