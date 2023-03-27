package number_programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// a = 20, b = 10
	    int temp = a;	
		a = b;
		b =temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		// ------------------------------
		// without using3rd variable How to swap 2 number's value
		
		int x =100;
		int y = 200;
		
		x = x + y; // x =300
		y = x - y; //100
		x = x - y; //200
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
