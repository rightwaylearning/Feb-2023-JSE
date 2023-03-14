package static_factory;

public class Controller {

	public static void main(String[] args) {
	      
//		C c = new C();
//		B b = new B(c);
//		A a =new A(b);
//		
//	   System.out.println(a.messageA);
		
		
		System.out.println(StaticWayToCall.m1());
		
//		pahile ya madhe static factory ch object return hoat aahe tya mule aasa aala aahe

		A a1 =StaticWayToCall.m1();
		
		System.out.println(a1.messageA);
		
		
	}
}
