package GeneralKnowlwdge;

public class IsExistElementArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println(isExist(arr,70));
		
	}
	
	static boolean isExist(int[] arr,int element) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==element) {
				return true;
			}
		}
		
		return false;
	}
	

}
