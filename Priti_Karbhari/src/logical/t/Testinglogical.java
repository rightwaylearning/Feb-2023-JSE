package logical.t;



public class Testinglogical {
public static void main(String[] args) {
		
		Logical l = new Logical();
		
		if(l.m1(32, 440)) {
			System.out.println("hello this is method if yes then call this method");
		}
		

		if(l.firstNumber() > l.secondNumber()) {
			System.out.println("hello this is int return type method if yes then call this method");
		}
		
		System.out.println("if if expression is false then this can call");
	
	
	
	}


}
