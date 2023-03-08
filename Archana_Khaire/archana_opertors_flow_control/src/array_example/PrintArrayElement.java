package array_example;

public class PrintArrayElement {
	
	public static void main(String[] args) {
		int[] arr = new int[5]; // size = 5  valid index 0 to 4
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
	    arr[3] = 400;
	    arr[4] = 500;
	    
	    
	    int i = 0;
	    
	    while(i<5) {
	    	System.out.println(arr[i]);
	    	i++;
	    }
	    
	}

	}


