package logical.opt;

public class Test {
	static int a= 10;
	static int b= 20;
	
	public static boolean exp1 () {
		return a+10==b;	
	}
	
	public static boolean exp2 () {
		return b==b;
	}
	
	public static void main(String[] args) {
		
		if(Test.exp1() && Test.exp2() ) {
			System.out.println("true part");
		}else {
			System.out.println("false part");
		}
		
				
	}

}
