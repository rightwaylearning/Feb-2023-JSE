package finally_block;

public class ReturnVsFinallyBlock {

	
	public static void main(String[] args) {
		
		ReturnVsFinallyBlock obj = new ReturnVsFinallyBlock();
		
		obj.testMe();
	}
	
	
	void testMe() {
		System.out.println("1");
		try {
			System.out.println("2");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
}



class A{
  final int i = 10;
  
  final void m1() {
	  final int y = 90;
	 
  }
	
}

class B extends A{
	
	void m1() {
		  final int y = 90;
		 
	}
}
















