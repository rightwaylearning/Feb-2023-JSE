package switch_case_examples;

public class ColorSelection {
	
	String select_Color(char ch) {
		
		String color;
		
		switch (ch) {
		
		case 'B' : {
			color = "Blue";
			break;
		}
		
		case'P' : {
			color = "purple";
			break;
		}
		
		default : {
			color = "No Match Any Color";
		}
		
		}
		
		
		
		return color;
	}
	
	

}
