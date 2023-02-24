package conditional_operator;

public class Test {
	
	public static void main(String[] args) {
		
		int x = 800;
		int y= 600;
		
		if(x>y) {
			System.out.println("X is big element"+x);
			
		}else {
			System.out.println("Y is big element"+y);
		}
		
			
		int r= (x < y)? x:y;
		System.out.println("big element is"+r);
		
		
		
		
		
	}

}
