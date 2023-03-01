package switch_case;

public class NameMatch {

	public static void main(String[] args) {

		String name = "urvashi";

		switch (name) {

			case "Samntha": {
				System.out.println("she is south indian actress Samntha prabhu ");
				break;
			}
			
			case "Nayntara":{
				System.out.println("she is south tamil actress Nayantara");
				break;
			}
			
			case "Aliya":{
				System.out.println("she is north indian actress Aliya bhatt");
				break;
			}
			
			default:{
				System.out.println("No match");
				break;
			}
			

		}

	}
}
