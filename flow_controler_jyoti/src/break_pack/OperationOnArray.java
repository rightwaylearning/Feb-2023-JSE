package break_pack;

public class OperationOnArray {

    int serach(int[] arr, int targetElement) {
    	int index = -1;
    	
    	for(int i = 0; i < arr.length; i++) {
    		
    		if(arr[i] == targetElement) {
    			index = i;
    		}
    	}
    	return index;
    }
}
