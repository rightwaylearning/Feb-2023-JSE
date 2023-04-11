package general.kwlg;

public class ParingWithEveryElement {

	public static void main(String[] args) {
		// assume there is no any duplicate element inside array
		int[] arr = {10,12,34,1,2,5,66};
		// 10 - 12, 10-34, 10-1,10-2,10-5,10-66
		// 12 -34, 12-1,12-2,12-5,12-66
		// 34-1,34-2,34-5,34-66
		// 1-2,1-5,1-66
		// 2-5,2-66
		// 5-66
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("{"+arr[i] +"-"+arr[j]+"}");
			}
			System.out.println();
		}
	}
}
