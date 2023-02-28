package conditional_operator;

public class Test1 {
	
	public static void main(String[] args) {
		int x = 150;
		int y= 201;
		
		if (x > y) {
			System.out.println(" X is big element ]="+x);
		}else {
			System.out.println(" Y is big element = "+ y);
			
		}
		
		int p = (x < y)? x:y;
		System.out.println("which is B element ="+p);
	}
	

}
