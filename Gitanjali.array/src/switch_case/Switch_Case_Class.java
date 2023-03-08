package switch_case;

public class Switch_Case_Class {
	public static void main(String[] args) {
		int num = 70;
		switch (num) {
		case 10: {
			System.out.println("match is found for 10");
			break;
		}
		case 20: {
			System.out.println("match is found for 20");
		}
		case 30: {
			System.out.println("match is found for 30");

		}
		default: {
			System.out.println("no match found");
		}
		}
	}
}
