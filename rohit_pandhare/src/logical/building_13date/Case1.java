package logical.building_13date;

public class Case1 {
	
	public static void main(String[] args) {
		int a = 43;
		int i = 44;
		
		boolean r = a<=i;
		
		System.out.println(r);
		
//		boolean is allowed only to store true false result
		
//		here we can not get result of true > false
		
//		we only get result from primitive data type not from reference type
		
//		String s = "23";
//		String f = "233";
		//		boolean f1 = s > f;
		
//		System.out.println(f);
		
		
		int a1 = 10;
		int b = 20;
		
		boolean r1 = a1 <= b;
		
		System.out.println(r1);
		
		
		
		String s = "123";
		
		String s1 = "124";
		
		// boolean b1 = s < s1;
		 // The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
		// System.out.println(b1);
		
		boolean b3= true;
		int m = 10;
	//	boolean r2 = b3 > m;
		
		
		boolean b5 =true;
		boolean b6 = true;
		
		//boolean r4 = b5 >= b6;
		 // The operator >= is undefined for the argument type(s) boolean, boolean
		
		// IMP 
		
		boolean r7 = 10 > 20;
		System.out.println(r7); // false;
		
	//	boolean r8 = 10 > 9 > 8;
//		error because
		
//		boolean r8 = true > 8;
		
//		aasa value ch nahi yenar na boolean ek operand aahe aani primtive ek aahe 
//		donhi pn primitive ch pahije
		
		
		System.out.println(10 > 'A');
		System.out.println(10 >= 10.00F);
		System.out.println('B' > 66.89);
		
		System.out.println(31/2.0);


	}

}
