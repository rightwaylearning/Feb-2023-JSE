package for_loop_examples;

public class ForLoop2 {
	
	public static void main(String[]  args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int index=0;
		
		while(index <arr.length) {
			System.out.println(arr[index]);
			index++;
		}
		
		System.out.println("===========================");
	//..................................................
		
		int[] arr1 = {10,20,30,40,50};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
	}

}
