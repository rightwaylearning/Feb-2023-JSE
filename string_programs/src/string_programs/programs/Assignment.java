package string_programs.programs;

public class Assignment {

	public static void main(String[] args) {

		String str = "one two three four five";
		System.out.println(str);
		StringBuffer br = new StringBuffer();

		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			br.append(reverseWord(arr[i]));

			if (i < arr.length - 1) {
				br.append(" ");
			}
		}
		
		System.out.println(br.toString());

	}

	static String reverseWord(String str) {
		// here you can write custom logic
		return new StringBuffer(str).reverse().toString();
	}
}
