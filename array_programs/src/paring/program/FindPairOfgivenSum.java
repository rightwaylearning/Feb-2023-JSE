package paring.program;

public class FindPairOfgivenSum {
	
	
//	public static void main(String[] args) {
//		int[] arr = {8,3,7,2,6,9,14,-4,1,4};
//		int sum = 10;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i +1; j < arr.length; j++) {
//				
//				if(arr[i]+arr[j] == sum) {
//					System.out.print("{"+arr[i]+"-"+arr[j]+"}");
//				}
//			}
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		int[] arr = {8,3,7,2,6,9,14,-4,1,4};
		int sum = 10;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				for (int j2 = j+1; j2 < arr.length; j2++) {
					
					if(arr[i]+arr[j]+ arr[j2]== sum) {
						System.out.println("{"+arr[i]+","+arr[j]+","+arr[j2]+"}");
					}
				}
			}
		}
		
	}

}
