package access.var.in.method;

public class Case1 {
	
	int a ;
	int b ;         //instance property
	static int x;
	static int y;    //static property
	
	void m1() {
		
//		we can direct access instance and static property in 
//		same class
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		//aapn aasa pn access karu shaktoh static but best practice
//		static var access karaych aasel tr compulsory className.var
//		aasa access karych 
		
//		static memory ekdach dete but tyala aapn object ref var
//		sobt kiti veles pn access karu shaktoh
		
//		Test t1 = new Test()
//				t1.x =32;
//		        t1.y = 23;
//		      aasa pn karu shaktoh but only one time memory bhete
		
		}
	
	static void m2() {
		
//		System.out.println(a); aasa instance var access nahi karu
//		shakt error dakhate tya mule object create karav lagel?\
//		System.out.println(b);
		
		Case1 c = new Case1();
	   System.out.println(c.a);
	   System.out.println(c.b);
		
		
		System.out.println(x);
		System.out.println(y);
	}
	

}
