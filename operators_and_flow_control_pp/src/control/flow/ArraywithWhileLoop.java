package control.flow;

public class ArraywithWhileLoop {
	
public static void main(String[] args) {
		
		
		int[] arr = new int[10]; 

		int i =0; // index init
		int value = 100;
		
		while(i < arr.length) {  // i < arr.length
						
			arr[i] = value;
			
			value = value + 100;
			i++;                    // 
		}
		
		PrintArray p = new PrintArray();
		p.printArrayEelement(arr);
    
}
}