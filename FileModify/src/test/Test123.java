package test;

public class Test123 {
	
	public static void main(String[] args) {
		
		System.out.println(toUpperCaseWorld("hi heelo   how r u .  test."));
	}

	public static String toUpperCaseWorld(String str) {

	//	str = "hi hello    how  r  u doing good nice .";
		System.out.println(str);
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 && Character.isLetter(arr[0])) {
				arr[i] = Character.toUpperCase(arr[i]);
			} else if (arr[i] == ' ' && i + 1 < arr.length && Character.isLetter(arr[i + 1])) {
				arr[i + 1] = Character.toUpperCase(arr[i + 1]);
			}

		}
		str = String.valueOf(arr);
		return str;
	}

}
