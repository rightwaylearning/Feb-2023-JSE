package GeneralKnowlwdge;

public class ParingWithEveryElement {
	
	public static void main(String[] args) {
		
		int[] arr = {10,23,45,67,89,12,34,55,66,21,87,90};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				System.out.println("{"+arr[i]+ "-" +arr[j]+"}" );
			}
			System.out.println();
			
		}
		
		
	}

}
