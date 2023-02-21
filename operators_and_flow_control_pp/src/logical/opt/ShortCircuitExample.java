package logical.opt;

public class ShortCircuitExample {
	
	public static void main(String[] args) {
		
		Validate v = new Validate();
		
		if(v.isValidAge(12) && v.isIndian(92)) {
			System.out.println("please allow him for voter id card");
		}else {
			System.out.println("sorry");
		}
	}
	
}
