package for_loop;

public class ContinueCase {
	
	public static void main(String[] args) {
		
int[] arr = {32,43,54,65,76,87,8,667,656,434,43};
		
		int target = 65;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			if(arr[i] == target) {
				
				System.out.println("the number in if case is = "+ arr[i] + " index is "+ i);
	
				continue;
				
//				continue cha aarth aasa aahe ki aata hai yacha khali execute karnyachi
//				garj nahiye loop continue rahudya
				
//				continue jr kela nasta tr khalcha pn print zal aasta
			}
			
			System.out.println("the index are to check " + arr[i]+ " value are " + i);
			
		}

		
		
	}

}
