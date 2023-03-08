package for_loop;

public class BreakCase {
	
public static void main(String[] args) {
		
		
		int[] arr = {32,43,54,65,76,87,8,667,656,434,43};
		
		int target = 65;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			if(arr[i] == target) {
				
				System.out.println("the number in if case is = "+ arr[i] + " index is "+ i);
	
				break;
				
//				aata hai tr print hoil but saglya condition check karel tya mule break lihitoh
				
//				break mhnje conditon check zalya zalya for loop chya baher ya
			}
			
			System.out.println("the index are to check " + arr[i]+ " value are " + i);
			
		}
		
		
		
		
	}

}
