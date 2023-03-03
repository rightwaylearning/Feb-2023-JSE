package bitwise_operator;

public class Example {
	
	public static void main(String[] args) {
		int a=100;
		int b=200;
		System.out.println(b > a ^ ++a < 100);
		
		
		if(b<a & ++a>100 ) {
			a++;	
		}else {
			b++;
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
