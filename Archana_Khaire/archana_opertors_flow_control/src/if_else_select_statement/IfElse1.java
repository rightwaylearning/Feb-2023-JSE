package if_else_select_statement;

public class IfElse1 {
	public static void main(String[] args) {
		
		int a = 10;
		if(a == 10) {
			System.out.println("I am true part block");
		} else {
			System.out.println("I am flase part block");
		}
		
		/* int b = 20;
		// type mismatch can not convert int to boolean
		if(b = 20) {
			System.out.println("I am true part block");
		} else {
			System.out.println("I am flase part block");
		} */
		
		
		boolean b1 = true;
				
			if(b1=false) {
				System.out.println("I am true part block");
				
			}	else {
				System.out.println("I am false part block");
			}
			
			if(b1==false) {
				System.out.println("I am true part block");
			} else {
				System.out.println("I am false part block");
			}
	}

}
