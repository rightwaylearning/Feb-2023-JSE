package employee.info;

public class EntryPoint {

	public static void main(String[] args) {
		Switcher s = new Switcher();
	
		
		// case How to call method whio having Object o is param
		
//		CC c= new CC();
//		s.m1(c);
		// s.m1(new CC())
		
		
		s.m1(new BB());
	}
}
