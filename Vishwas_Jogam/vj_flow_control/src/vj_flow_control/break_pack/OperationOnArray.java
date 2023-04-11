package vj_flow_control.break_pack;

public class OperationOnArray {
	int serach(int[] arr, int targetElement) {
		int index  = -1;
		
		for(int i = 0;  i < arr.length; i++) {   
			 // once's if u get ur valid index still for loop searching functionality is going on
			if(arr[i] == targetElement) {
				index = i;
			}
		}
		
		return index;
	}
	
	int serach1(int[] arr, int targetElement) {
		
		int index  = -1;
		
		for(int i =0; i <arr.length; i++) {
		  
			 if(arr[i] == targetElement) {
				 index = i;
				 break;
			 }
		}
				
		return index;
	}
}


