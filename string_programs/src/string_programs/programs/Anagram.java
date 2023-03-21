package string_programs.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "race";
		String str2 = "care";
		
		char[] arr1 = str1.toCharArray();  
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		                                  
		Arrays.sort(arr2);
		
		str1 = new String(arr1);
		str2 = new String(arr2);
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("false");
		}
		
		
		String num = "890";
		Integer i = Integer.parseInt(num);
		
	}
}
