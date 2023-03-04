package forloop;

public class Case6 {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		for ( i = 0; i < 10; i++) {
			
			if(i%2 ==1) {
				System.out.println("if " + i);
				break;
			}
			else {
				System.out.println("else " + i);
			}
		}
			System.out.println("this is outside loop for "+i);
		
	}

}
