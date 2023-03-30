package compile_time_polyBy_overloading_Cases;

class Case3{
	
	
}

public class Case1 {

//	with primitive type by compiler 
//	1.exact match 
//	2.auto-promotion
//	3.auto-boxing then exact match
//	4.recent parent
//	5.compile time error
	
	
	void m1(int a) {
		System.out.println("Exact match");
		
	}
	void m1(float a) {
		System.out.println("autopromotion");
		
	}
	
//	void m1(Case3 c) {
//		System.out.println("Case3 match");
//	}
//	void m1(Integer a) {
//		System.out.println("Autoboxing hote and exact match");
//		
//	}
//	void m1(Number a) {
//		System.out.println("Recent parent");
//		
//	}
	void m1(Object a) {
		System.out.println("root parent");
		
	}
//	void m1(String a) {
//		System.out.println("Compile time error");
//		
//	}
	void m1(Case1 a) {
		System.out.println("Case1 match");
		
	}
	
	
	public static void main(String[] args) {
		
		Case1 c = new Case1();
		
		int a = 10;
		
	
		Case3 c1 = new Case3();
		
//		Case 3 with null is only going to child only
		c.m1(null);
		
		
	}
	
	
}
