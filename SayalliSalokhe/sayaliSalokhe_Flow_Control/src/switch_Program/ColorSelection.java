package switch_Program;

public class ColorSelection {
	public ColorSelection() {
		// TODO Auto-generated constructor stub
	}
	public static char Cselection(char color) {
		switch (color) {
		case 'Y':{
			System.out.println("Color is Yellow");
			break;
		}
		case 'G':{
			System.out.println("Color is Green");
			break;
		}
		case 'W':{
			System.out.println("Color is White");
			break;
		}
		
		case 'B':{
			System.out.println("Color is Black");
			break;
		}
		default:{
			System.out.println("pass wrong Color Charachter");
			break;
		}
		
		
		}
		return color;
		
		
	}

}
