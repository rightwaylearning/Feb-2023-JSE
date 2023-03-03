package switch_example;

public class InputSchool {

	public School info(int ageMonths) {

		School school = null;

		if (24 <= ageMonths && ageMonths < 36) {
			school = new School("Play Group", 24, 36, 45000.00);
		} else if (36 <= ageMonths && ageMonths < 48) {
			school = new School("Nursery Group", 36, 48, 48000.00);
		} else if (48 <= ageMonths && ageMonths < 60) {
			school = new School("LKG", 48, 60, 55000.00);
		} else if (60 <= ageMonths && ageMonths < 72) {
			school = new School("UKG", 60, 72, 65000.00);
		}
		return school;

	}

}
