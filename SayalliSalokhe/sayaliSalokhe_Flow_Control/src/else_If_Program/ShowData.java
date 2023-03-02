package else_If_Program;

public class ShowData {
	public static void printdata(Admision admision) {
		System.out.println("/--------------------------------------------------");
		if (admision != null) {
			System.out.println("Class room:" + admision.getClassRoom());
			System.out.println("Age:" + admision.getLowerAge()+"between"+admision.getUpperAge());
			System.out.println("Fees:" + admision.getFees());

		}
		else {
			System.out.println("your child age is not valid");
		}
		System.out.println("/---------------------------------------------------");
			
	}

}
