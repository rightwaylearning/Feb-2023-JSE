package user_input;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		
		int[] arr = {32,43,54,23,54,22,68,98,43,21};
		
		UserInputProgram u = new UserInputProgram();
		
		int size = u.printSizeOfEvenElement(arr);
		
		System.out.println(size);
		
		System.out.println("<<<<<>>>>>>>>>");
		
		int[] Output = new int[size];
		
	
		int[] result = u.printData(arr, Output);
		
		u.printSizeOfEvenElement(result);
	
//		aata ya madhe input yete 
		
		
		
		
	
	}

}
