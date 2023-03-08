package for_loop_with_example;

public class EntryPoint {

	
	public static void main(String[] args) {
		
		
		int[] arr = {324,43,23,43,545,6676,45,43,54,2};
		
		TakeNumber t = new TakeNumber();
		
		int value = t.search(arr, 43);
	
		System.out.println("yachi value hai vegla aahe "+value);
	}
}
