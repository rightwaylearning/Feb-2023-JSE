package forloop.example;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		int[] arr = {123,23,34,45,56,67,78,90,87,65};
		
		Number n = new Number();
		
		int value = n.search(arr, 56);
		
		System.out.println( "here search value  "+ value);
		
	}

}
