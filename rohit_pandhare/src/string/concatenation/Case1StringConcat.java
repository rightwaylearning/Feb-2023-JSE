package string.concatenation;

public class Case1StringConcat {
	
	public static void main(String[] args) {
		
		String s= "hello ";
		String s1= "Good";
		
		System.out.println(s + s1);
		
		String s2= "hello ";
		int s3= 21;
		
		System.out.println(s2 + s3);
		
		int s4= 21;
		String s5= " hello ";
		
		System.out.println(s4 + s5);
		
		
		int s6= 21;
		int s7= 43;
		
		System.out.println(s6 + s7);
		
		System.out.println("" + 23 + 32+ 32); //233232
//		left to right compliation string + int 
		
		System.out.println(23 + 32 + "" + 32 + 22); //553222
		
		System.out.println(23 + 32 + "" + true+  32 + 22 + 'A');
//		55true3222A
		
	}

}
