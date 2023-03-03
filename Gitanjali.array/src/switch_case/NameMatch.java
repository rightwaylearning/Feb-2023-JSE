package switch_case;

public class NameMatch {
	public static void main(String[] args) {
		String name = "Samantha";
		switch (name) {
		case "Samantha": {
			System.out.println("she is south indian actress samantha prabhu");
			break;
		}
		case "Nayantara": {
			System.out.println("she is south tamil actress Nayantara");
			break;
		}
		case "Aliya": {
			System.out.println("she is north indian actress Aliya Bhatt");
			break;
		}
		default: {
			System.out.println("no match");

		}
		}
	}
}
