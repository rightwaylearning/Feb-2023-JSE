package calculator.maths.addition;

public class Maths {
	
	Maths(){}
	
	void add(int...product){
		
//	int[] product = new int[];   yacha aarth aasa aaste ya madhe kiti 
//		pn integer var pass karu shaktoh
		
//		System.out.println(product[0]);
		{
			System.out.println("block reverse order print");
		int i = 1 ;
		int len = product.length;
		while(i <= len) {
			System.out.println(product[len-1]);
			len--;
		}
		}    
		
		{
		
			System.out.println("block reverse order print sum");
	         int sum = 0 ;	
			int i = 1 ;
			int len = product.length;
			while(i <= len) {
				System.out.println(product[len-1]);
				sum = sum + product[len-1];
				System.out.println(sum);
				len--;
			}
			
			System.out.println("total sum = "+sum);
		}
		
	}
	

}
