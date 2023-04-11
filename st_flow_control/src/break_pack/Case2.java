package break_pack;

public class Case2 {
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,6,7,8,2,3,4,51,6};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("index " +i);
			
		if(arr[i] == 5) {
			System.out.println("Number is present");	
			break;
			}
		}
	}

}
