package for_loop;

public class Case1 {

	public static void main(String[] args) {
		
		
		int i;
		
		for(i=0 ; i<10 ;i++ ) {
			
			if(i%2 == 1 ) {
				System.out.println("if " +i);
				
			}
			
			System.out.println("this is inside"+i);
		}
		
		System.out.println("this is outside of loop "+i);
		
	}
}
