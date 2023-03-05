package while_Loop_Cases;

public class Case2FinalBooleanFalse {
public static void main(String[] args) {
		
		final boolean b = false;
		
		while(b) {
			// Unreachable code
			System.out.println("while loop body");
		}
		
		System.out.println("out side oif while loop body");
		
	}

}
