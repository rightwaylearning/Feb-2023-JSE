package test;

public class ShortCircuitExample {
	public static void main(String[] args) {
		Validate v = new Validate();
		
		if(v.isValidAge(32) && v.isIndian(91)) {
			System.out.println("Please allow him for voter is card");
		}else {
			System.out.println("Sorry");
		}
	}
}
