package switch_example;

public class Control {
	
	public static void main(String[] args) {
		
		InputSchool s = new InputSchool();
		School s1 = s.info(63);
		PrintKid.Admission(s1);
		
		
		InputSchool x = new InputSchool();
		School s2 = s.info(38);
		PrintKid.Admission(s2);
	}
	
	


}
