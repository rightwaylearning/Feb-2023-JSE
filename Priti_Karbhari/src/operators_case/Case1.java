package operators_case;

public class Case1 {
public static void main(String[] args) {
		
//		operators are relational and arthmatic covered upto 16date
//		
//		both two operators relational and arthmatic are binary 
//		operator becoz both then need only 
//		two operand and in between they need operators
		
//		operators in relational 
		
//		> less than           >= less than or equal to 
//		< greater than        <= greater than or equal to
		
//		operators in arthmatic
		
//		+ - * / % modulus
		
		int a = 32;
		short c = 32;
		
//		ethe madhe internal 
//		int temp = a + c;  aasa bante
		
//		aani ya mule constant int aaste aani je max aahe te type
//		detat
		 
//		max(int , operandfirstdatatype , operandseconddatatype)
		
		int b= a +c ;
		
//		max (int , int ,short)
		
		System.out.println(b);
		
		if(true) {
			System.out.println("if true if expression then only this if execute");
		}
		
//		equality operator ==
		
		
		if(98 == 32) {
		
//			this is false statement thats why this will not work
			
			System.out.println("this is false statement thats why this will not work");
		}
		
		if(true == true) {
			
//			this is false statement thats why this will not work
			
			System.out.println("this is true statement thats why this will not work");
		}
		
		if(false == true) {
			System.out.println("false");
		}
		
		System.out.println(78 != 78.0F);
		
		System.out.println(78 != 78.0F == (43 == 43.10F));
		
		
		
	}


}
