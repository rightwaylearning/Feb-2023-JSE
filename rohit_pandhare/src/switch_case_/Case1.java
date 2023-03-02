
package switch_case_;

public class Case1 {

	public static void main(String[] args) {
		
		
		int num = 25 ;
		
		switch(num) {
		
//		pahile check karte je case 21(label) aahe mhnjech expression sobt expression 
//		match hoat aahe mg tya madhe jate nasta outside
//		aani break jr nahi lihil tr khalcha statement pn execute
//		switch case mule readability yete mhnje code vachnya sathi sopa jate 
//		else if ya control flow la fkt 3 5 line changle vattat jasth line cha 
//		code lihila ki code readability 
		
		case 21 : {
			System.out.println("hello this is 21 number");
			
		}
		case 25 : {
			System.out.println("hello this is 25 number");
			break;
		}
		case 28 : {
			System.out.println("hello this is 28 number");
			break;
		}
		case 30 : {
			System.out.println("hello this is 30 number");
			break;
		}
		case 32 : {
			System.out.println("hello this is 32 number");
			break;
		}
		default :  {
			System.out.println("hello this is default number");
			break;
		}
		}

		
		
		
		String name = "rancho";
		
		switch(name) {
		
//		name sathi jas aahe ts as it is takav lagte space pn nhai chalat yat 
//		
		case "raghav " : {
			System.out.println("hello this is raghav");
			break;
		}
		case "Ravi" : {
			System.out.println("hello this is ravi");
			break;
		}
		case "Sharaddha" : {
			System.out.println("hello this is Shraddha");
			break;
		}
		case "rahul": {
			System.out.println("hello this is rahul");
			break;
		}
		case "rancho" : {
			System.out.println("hello this is rancho");
			break;
		}
		default :  {
			System.out.println("hello this is default");
			break;
		}
		}
		
		
		
		
		
		
		
	}
}
