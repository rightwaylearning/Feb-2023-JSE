package switch_case;

public class NameMatch {
	
	public static void main(String[] args) {
		
		String name = "Anushka";
		
		switch (name) {
		 
		case "Samntha": {
			System.out.println("she is south indian actress samntha prabhu");
			break;
     		}
		case "Nayantara": {
			System.out.println("she is south tamil actress Nayantara");
			break;
     		}
		
		case "Aliya": {
			System.out.println("she is north indian actress Aliya bhatt");
			break;
     		}
		
		default:{
			System.out.println("No Match");
			break;
		}
		}
	}

}
