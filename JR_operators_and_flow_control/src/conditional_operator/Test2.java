package conditional_operator;

public class Test2 {
	
	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		int z=30;
		
		if(x >z && x>z) {
			System.out.println("x is big value"+x);
		}else if(y > x && y > z ) {
			System.out.println(" y is big value"+y);
		}else if(z>x && z>y) {
			System.out.println("z is big value"+ z);
		}
		
		int result =(x>y && x>z)? x:(y>x && y>z)? y:z;
		System.out.println("big value "+result);
		
	}
}