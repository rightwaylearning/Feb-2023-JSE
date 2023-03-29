package practice_29mar;

public class Case1 {

	
	public static void main(String[] args) {
		
		
		int a = 1;
		
		int c = a++ + ++a + a++ + ++a - ++a;
//		         1      3    3     5  -  6
		
//		relational operator la 2 operand chi garaj aaste jya madhe 2 operand aastat tyala binary operand mhntat
		
//	boolean r1 =	10 > 1;
		
		
	byte b = 10;
	
	int i = 123;
	
	int i1 = i +b;
	
	System.out.println(i1);
		
		System.out.println(c);
		
//	parent chalte but vegla vegla point karat aasel tr false value aani ekach object 
//	kadhe 2 jn point karat aasel tr true value aani vegle vegle class astil te error
		A a1 = new A();
		Object a2 = new Object();
		B b1 = new B();
		
		boolean r = a1 == a2;
		
		System.out.println(r);
		
		
		
		
	}
}
