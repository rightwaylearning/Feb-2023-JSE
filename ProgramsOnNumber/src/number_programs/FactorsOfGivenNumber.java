package number_programs;

public class FactorsOfGivenNumber {
	
	public static void main(String[] args) {
		int num = 1;
		boolean flag = true;
		
		for(int i = 1 ; i <=num ; i++) {
		     if(num%i == 0) {
		    	System.out.print(i +" ");
		     }	
		}
		
	}
}
