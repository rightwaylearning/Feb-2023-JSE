package user_input;

public class UserInputProgram {
	
	
	public int printSizeOfEvenElement(int[] arr) {
		
//		int[] arr = {}
		int i = 0;
		int index = 0;
		
		for(i = 0 ; i< arr.length ; i++) {
			
			if(arr[i] %2 == 0) {
			System.out.print(index + "  "  + arr[i] + "  ");
			System.out.println();
			index++ ;
			}
		}
		
//		but ya madhe fkt arr[i] hai i hai vegla yete aani index vegla yete index 0 
//		aasel tr i madhe 3 yete mhnje  index 0 = arr[ 3] aasa
//		but ya madhe last la value 6 yete ka karan length ghaychi aahe na tya mule
		
		return index;
		
	}
	
	public int[] printData(int[] arr , int[] outPut ) {
		
		int j  = 0;
		for(int i = 0 ; i<arr.length ; i++) {
			
			if(arr[i] % 2 == 0) {
			
				outPut[j] = arr[i]; 
                 j++;			
			}
			
		}
		
		
		return outPut;
	}

}
