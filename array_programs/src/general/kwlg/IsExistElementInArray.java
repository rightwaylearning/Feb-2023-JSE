package general.kwlg;

public class IsExistElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,30,45,67,80};
		
		System.out.println(isExist(arr,40));
		
	}
	
	static boolean isExist(int[] arr,int element) {
		
		// linear search;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==  element) {
				return true;
			}
		}
		
		return false;
	}
}
