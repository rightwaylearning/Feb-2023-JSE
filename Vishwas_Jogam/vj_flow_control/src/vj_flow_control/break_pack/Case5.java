package vj_flow_control.break_pack;

public class Case5 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		for (int i = 0; i < arr.length; i++) {
			  
			  if(arr[i] % 2 != 0) {
				  continue;
			  }
			
			  int  s =  arr[i]*arr[i];
			  System.out.println("Yes, I done my job "+ s);
			
		}
	}
}
