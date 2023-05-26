package compiletime.opt;

public class Test {
	
	public static void main(String[] args) {
		// case 1
//		String s1 =  "abc" + "pqr";
//		String s2 = "abcpqr";
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		
//		// case 2
//		String m1 = "abc";
//		String m2 ="pqr";
//		String s1 =  m1 + m2;
//		String s2 = "abcpqr";
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		
		// case 3
//		final String m1 = "abc";
//		final String m2 ="pqr";
//		String s1 =  m1 + m2;
//		String s2 = "abcpqr";
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		
		
		//  ==   ,  .equals
		
		
		String s1 = new String("you cannot change me!");
		String s2 = new String("you cannot change me!");
		System.out.println(s1==s2);  // false
		String s3 = "you cannot change me!";
		System.out.println(s1==s3);  // false
		String s4 = "you cannot change me!";
		System.out.println(s4==s3); // true
		String s5 = "you cannot"+" change me!";  // compile time
		String s6 = "you cannot";
		String s7 = s6 + " change me!";
		System.out.println(s3==s7);
		final String s8 ="you cannot";
		String s9 =  s8 + " change me!"; // compile time
		System.out.println(s3==s9);
		System.out.println(s6==s8);

}
}