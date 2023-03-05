package if_else_select_statement;

public class IfElse5 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 200;
		
		if(true) {
			
			System.out.println(args);
			{
				System.out.println(b);//200
			}
			
			System.out.println(b);//200
		}
		System.out.println(a);//10
	}

}
