package logical_operator;


public class Test {
	static int a=30;
	static int b=60;
	
	public static boolean exp1() {
		
		return a +30 == b;
		
	}
	
	public static boolean exp2() {
		
		return b ==50;
		
	}
	 
	public static void main(String[] args) {
	
		if (Test.exp1() && Test.exp2()) {
			System.out.println("true part");

		} else {
			System.out.println("false part");
		}
		
	}
}
