package static_variable;

public class Controller {

	public static void main(String[] args) {
		X p = new X();
		p.a = 100;
		p.b = 200;
		X.c = 300;
		
		
		X p1 = new X();
		p1.a = 100;
		p1.b = 200;
		X.c = 400;
		

		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(X.c);
		
	}
	
	
}
