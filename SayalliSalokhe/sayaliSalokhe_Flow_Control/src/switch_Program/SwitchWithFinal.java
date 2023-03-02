package switch_Program;

public class SwitchWithFinal {
	public static void main(String[] args) {
		char ch = 'A';
		final char b1 = 'C';
		switch (ch) {
		case 'A': {
		}
		case 'R': {
		}
		/*
		 * //Invalid character constant case expressions must be constant expressions
		 * case b1: { }
		 */// use final with b1

		case b1: {
		}
		}
		// -----------------------------------------------

		int x = 30;
		final int y=20;
		switch (30) {
		case 80:{

		}
		/*
		 * Type mismatch: cannot convert from int to boolean 
		 * case 10+x:{
		 * 
		 * }
		 */
		case 10+y:{
			} 
		}
		
	}

}
