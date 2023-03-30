package compile_time_polyBy_overloading_Cases;

public class Case2 {
	
//	with reference type by compiler 
//	1.exact match 
//	2.recent parent
//	3.auto-unboxing then exact match
//	4.auto-promotion
//	5.compile time error
	
	void m1(Integer a) {
		System.out.println("Exact match");
		
	}
	void m1(Number a) {
		System.out.println("Recent Parent");
		
	}
	
//	void m1(Case2 c) {
//		System.out.println("case2");
//	}
	void m1(int a) {
		System.out.println("Auto-unboxing then exact match");
		
	}
	void m1(float a) {
		System.out.println("auto-promotion");
		
	}
	void m1(String a) {
		System.out.println("Compile time error konhi match zal nahi tr");
		
	}
	void m1(Case1 a) {
		System.out.println("Case1 match");
		
	}
	
	
	public static void main(String[] args) {
		
		Case2 c = new Case2();
		
		Integer a = 10;
		
//		aata hai ref var a aahe aani tyach object aahe 10 
//		10 ch object madhe convert hote
//		compiler static method call karte
//		tya pasun object return hote
	
		
		c.m1(a);
		
		
	}


}
