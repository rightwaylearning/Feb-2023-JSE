package paring_program;

public class PairOfGiven3NumberSum {
	
	public static void main(String[] args) {
		
		int[] arr = {8,7,9,2,1,3,5,4,6};
		int sum=10;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				for(int j2=j+1; j2<arr.length; j2++) {
					
					if(arr[i]+arr[j]+arr[j2] == sum) {
						System.out.println("{"+arr[i]+","+arr[j]+","+arr[j2]+"}");
						
					}
				
				}
			}
		}
	
	}

}
