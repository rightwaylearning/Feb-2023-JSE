package relational.operators;

public class RelationalOpt {
	
	public static void main(String[] args) {
		boolean flag = true;
		
			boolean f = 10 > 8;
			
			Logic l = new Logic();
		
		if(l.getResult(1, 8)) {
			System.out.println("I am inside if controll flow");
	}
		if(l.getFirstNumber() > l.getSecondNumber()) {
			System.out.println("I am inside second if");
			
		}
		
      System.out.println("I am end line of main method");
	}
}
