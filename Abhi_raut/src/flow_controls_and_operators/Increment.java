package flow_controls_and_operators;

public class Increment {
	public static void main(String[] args) {
		
    int a= 8;
	int b= 9;
	
	int c= ++a  - b-- + a++ + ++b - 1 ;
	
	System.out.println(a);// 10
	System.out.println(b);// 9
	System.out.println(c);// 17
	}
}

