package string_programs.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharacterFromWord {

	public static void main(String[] args) {
		
		String str = "congratulation";
		             // congratuli
		System.out.println(str);
			
//		char[] arr = str.toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
		
		Set<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		StringBuffer buff = new StringBuffer();
		for (Character character : set) {
			buff.append(character);
		}
		
		str = buff.toString();
		
		System.out.println(str);
		
		
	}
}
