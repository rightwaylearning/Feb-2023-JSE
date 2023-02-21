package logical_operator;

public class ShortCircuitExample {
	
	public static void main(String[] args) {
		
		
		Validate v = new Validate();
		
		if(v.isValidAge(32) && v.isIndian(80)) {
			System.out.println("please allow him for votor id card");
		
		}else {
			System.out.println("sorry");
			
		}
		
	}

}
