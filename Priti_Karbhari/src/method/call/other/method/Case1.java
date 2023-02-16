package method.call.other.method;

public class Case1 {
	
		
		int x;
		int y;
		
		void k1(String m) {
			System.out.println("I am k1 method");
			 this.k2();
			 System.out.println(m);
		}
		
		void k2() {
			System.out.println("I am k2 method");	
//		System.out.println();
		}
		

}
