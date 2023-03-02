package else_if_example;

public class consultant {

	public ClassRoom advice(int ageInMonth) {
		
		ClassRoom classRoom = null;

		if (24 <= ageInMonth && ageInMonth <36) {

			classRoom = new ClassRoom("play group", 24, 36, 40000.0);

		}

		if (36 <= ageInMonth && ageInMonth < 48) {

			classRoom = new ClassRoom("nursury", 36, 48, 45000.0);

		}

		if (48 <= ageInMonth && ageInMonth < 60) {

			classRoom = new ClassRoom("lkg", 48, 60, 50000.0);

		}

		if (60 <= ageInMonth && ageInMonth  < 72) {

			classRoom = new ClassRoom("ukg", 60, 72, 60000.0);

		}
		
		

		return classRoom;

	}

}
