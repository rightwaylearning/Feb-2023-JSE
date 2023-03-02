package switch_case_examples;

public class SwitchCaseExample1 {
	
	public static void main(String[] args) {
		
		int num = 500;
		
		switch(num) {
		
		case 100:{
			System.out.println("Match is found for 100");
			break;
		}
		case 200:{
			System.out.println("Match is found for 200");
			break;
		}
		case 300:{
			System.out.println("Match is found for 300");
			break;
		}
		case 400:{
			System.out.println("Match is found for 400");
			break;
		}
		case 500:{
			System.out.println("Match is found for 500");
			break;
		}
		default:{
			System.out.println("Match Number is not found");
			
		}
	  }
	}

}
