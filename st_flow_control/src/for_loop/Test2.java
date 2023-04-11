package for_loop;

public class Test2 {
	
	public static void main(String[] args) {
		
		String[] arr = {"ABC", "B", "C", "D"};
		
		for(int i =0; i<arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
	}

}


// 0 < 4 ---- i = 0+2
// 2 < 4 ---- i = 2+2