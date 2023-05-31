package string.class_methods;

public class RemainingMethods {

	public static void main(String[] args) {

		String str = "hi hello"; // total length = 8 >> valid 0-7
		System.out.println(str.substring(1));

		System.out.println(str.substring(1, 6));
		// first param start index = 1
		// second param end index = 6-1 =5

		System.out.println(str.length());

		String str1 = "ababbbcccdddaaa";

		String output = str1.replace('a', '*');
		System.out.println(output);

		String str2 = "hi hello how are u?";
		
		int index = str2.indexOf('h');  // first occurrence of the character
           // if not found char then return -1
		System.out.println(index);
		
		int index1 = str2.lastIndexOf('h');
		System.out.println(index1);
	}
}
