package flexibility_polymorphism;

public class AnsOfStaticCompileTime {
	
	public static void main(String[] args) {
	
		
		short s = 10;
		short s1 = 32;
		
		CompileTime_EarlyBinding c = new CompileTime_EarlyBinding();
		c.m1(s,s1);
		
//		c.m1(short s , short s1);
//		pahile exact match aahe ka nasta type promotion karte auto promotion
		
		char c1 = 'a';
		int i  = (int)c1;
		
		System.out.println(i);
		
		
		
	}

}
