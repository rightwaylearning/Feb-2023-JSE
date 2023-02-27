package logical_operator;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b= 13;
		    // a=11
		if(++a == 10 && ++b == 14) {
			System.out.println("I am true part");
			a++;
			b++;
		} else {
			System.out.println("I am false part");
		}
		
		System.out.println(a);// 11
		System.out.println(b); //13
	}

}
