package relational.operators;

public class EqualityOpt {
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 99;
		
		boolean r1 = a == b;
		System.out.println(r1);
		
		System.out.println(23 == 23);
			
		System.out.println(90.0 == 90);
		
		System.out.println('A'+1 == 'B');
		
		System.out.println('A' == 'A'); //true
 //---------------------------------------------------------
		System.out.println(false == false);  //true
		// boolean r1 = p1 == p2;
		
		System.out.println(78.1F != 78.5);  //true
		
		System.out.println(78.90 != 79.0 == false); //false
		
		System.out.println(90.00F == 90 == true); //true
		
		System.out.println(false != true == (78.1 ==78.1F)); //false
		                
	}

}
