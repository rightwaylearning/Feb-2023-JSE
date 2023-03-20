package parent.child.cases;

public class Family {

	public static void main(String[] args) {

		GrandFather g = new Father();

		g.business(); // share market (long term investor)
		g.income(); // Rs.125000 / month
		g.grandMother();

		System.out.println("-----------------------------------------------");

		Father f = new Child();

		f.business(); // share market (trader)
		f.income(); // Expected Rs.525000 / month
		f.grandMother();

		System.out.println("-------------------------------------------------");

		GrandFather g1 = new Child();

		g1.business();
		g1.income();
		// g1.Age();
		g1.grandMother();
	}

}
