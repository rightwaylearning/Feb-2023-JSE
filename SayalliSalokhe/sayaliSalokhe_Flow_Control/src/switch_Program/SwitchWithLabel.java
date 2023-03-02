package switch_Program;

public class SwitchWithLabel {
	public static void main(String[] args) {
		
		final int no = 80;
		switch (no) {

		case 10+40: {
			System.out.println("no is 10");
			break;
		}
		/*//----------------------------------------------------
		 * Type mismatch: cannot convert from int to byte 
		 * case 180000: {
		 * System.out.println("no is 180000");
		 *  break;
		 *   }
		 */
		/*//----------------------------------------------------
		 * Invalid character constant 
		 * case 'nila': {
		 *  System.out.println("no is nila");
		 *  break; 
		 *  }
		 */
		/*//----------------------------------------------------------
		 * Duplicate case 
		 * case 21: {
		 *  System.out.println("no is 21");
		 *  break; }
		 *  //---------------------------------------------------------
		 */
		case 21: {
			System.out.println("no is 21");
		}
		case 25: {
			System.out.println("no is 25");
		}
		default: {
			System.out.println("you choose wrong no");

		}

		}
	}
}
