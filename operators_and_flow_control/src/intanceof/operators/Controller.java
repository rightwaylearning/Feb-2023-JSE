package intanceof.operators;

public class Controller {

	public static void main(String[] args) {
		
		String str = new String("hello");
		MathsOpt maths = new MathsOpt();
		
		
		// ------------------------------------------------------
		
		User u = new User();
		
		u.caller(str);
		u.caller(maths);
	}
}
