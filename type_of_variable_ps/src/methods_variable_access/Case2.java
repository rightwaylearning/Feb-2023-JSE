package methods_variable_access;

public class Case2 {

		
		void m1() {
			Case1 c = new Case1();
			System.out.println(c.x);
			System.out.println(c.y);
			
			System.out.println(Case1.m);
			System.out.println(Case1.n);
			
		}
		
		static void m2() {
			Case1 c = new Case1();
			System.out.println(c.x);
			System.out.println(c.y);
			
			System.out.println(Case1.m);
			System.out.println(Case1.n);
		} 

	}


