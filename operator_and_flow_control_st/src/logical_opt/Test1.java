package logical_opt;

public class Test1 {
	
	static int a = 10;
	static int b = 20;
	
	public static boolean exp1() {
		return a+10 == b;
	}
	
	public static boolean exp2() {
		return b == 20;
	}
	
	public static void main(String[] args) {
		if(Test1.exp1() && Test1.exp2()) {
			System.out.println("true part");
		}else {
			System.out.println("false part");
		}
		
	}

}