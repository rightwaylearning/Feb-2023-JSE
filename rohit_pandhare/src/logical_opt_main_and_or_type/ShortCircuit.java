package logical_opt_main_and_or_type;

public class ShortCircuit {

public static void main(String[] args) {
		
		Validate v = new Validate();
		
		if(v.isValidAge(7) || v.isIndian(91)) {
			System.out.println("please allow him for voter id card");
		}else {
			System.out.println("sorry");
		}
	}
}
