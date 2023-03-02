package switch_case;

public class SelectColor {

	public static void main(String[] args) {
		 // class        // variable(ref)
		ColorSelection  colorSelection = new ColorSelection();
	                                   //opt    // constrcutor call
		
	
		String selectedColor = colorSelection.selectColor('M');
		
		System.out.println(selectedColor);
	}
}
