package else_If_Program;

public class Conslltant {

	public Admision advice(int ageInMonth) {
		Admision Admision = null;
		if (24 <= ageInMonth && ageInMonth < 40)
			Admision = new Admision("Play Group", 24, 36, 40000);
		else if (36 <= ageInMonth && ageInMonth < 48)
			Admision = new Admision("Nursury", 36, 48, 45000);
		else if (48 <= ageInMonth && ageInMonth < 60)
			Admision = new Admision("LKG", 48, 60, 50000);
		else if (60 <= ageInMonth && ageInMonth < 72)
			Admision = new Admision("UKG", 60, 72, 50000);

		return Admision;

	}

}
