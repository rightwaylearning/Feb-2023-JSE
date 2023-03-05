
package while_loop;

public class Case1 {

	public static void main(String[] args) {
		
		final boolean b = true;
		
		while(b) {
			System.out.println("while loop body");
		}
		// Unreachable code
		System.out.println("out side oif while loop body");
		
	}
}
