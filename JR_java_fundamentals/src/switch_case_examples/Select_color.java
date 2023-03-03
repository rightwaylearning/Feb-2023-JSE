package switch_case_examples;

public class Select_color {
	
	 public static void main(String[] args) {
		 
		 ColorSelection colorSelection = new ColorSelection();
		 
		 String selected_color = colorSelection.select_Color('M');
		 
		 System.out.println(selected_color);
	 }

}
