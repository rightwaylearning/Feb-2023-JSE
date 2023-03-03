package switch_case;

public class SelectColor {

	public static void main(String[] args) {
		//class         //variable(ref)
		ColorSelection colorSelection = new ColorSelection();
		                               //opt   // constructor call
	
		String selectedColor = colorSelection.selectColor('G');
		System.out.println(selectedColor);
}
}