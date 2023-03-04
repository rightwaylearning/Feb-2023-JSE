package array_example;

public class ArrayLoop {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		int i = 0;
		 int value = 100;
		 
		 
		 while(i<arr.length) {
			 
			 arr[i] = value;
			 
			 value = value + 200;
			 i++;
		 }
		 
		 PrintArrayElement p = new PrintArrayElement();
			 p.PrintArrayElement(arr);
		 
	}

}
