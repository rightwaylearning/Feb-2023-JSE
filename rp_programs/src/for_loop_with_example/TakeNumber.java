package for_loop_with_example;

public class TakeNumber {
	
	public int search(int[] arr , int number) {
		
		int index =-1;
		
		for (int i = 0; i < arr.length; i++) {
  
			 if(arr[i] == number) {
				 System.out.println(i);
				 
				 index = i;
			 }
			
		}
		
		
		
		return index;
	}

}
