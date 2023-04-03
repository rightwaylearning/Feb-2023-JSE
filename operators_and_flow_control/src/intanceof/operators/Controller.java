package intanceof.operators;

public class Controller {

	public static void main(String[] args) {
		
		String str = new String("hello");
		
		int i =10;
		MathsOpt maths = new MathsOpt();
		
		
		// ------------------------------------------------------
		
		User u = new User();
		
		u.caller(i);
		u.caller(maths);
	}
}
