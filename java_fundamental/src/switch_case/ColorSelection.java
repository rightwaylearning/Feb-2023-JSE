package switch_case;

public class ColorSelection {
	
	
	String selectColor(char ch) {

		String color;

		switch (ch) {

				case 'W': {
					color = "White";
					break;
				}
		
				case 'G': {
					color = "Green";
					break;
				}
		
				case 'Y': {
					color = "Yellow";
					break;
				}
		
				case 'R': {
					color = "Red";
					break;
				}
		
				case 'B': {
					color = "Blue";
					break;
				}
		
				default: {
					color = "sorry no match";
				}

		}

		return color;
	}
}
