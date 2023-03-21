package string_programs.programs;

import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String str = "hello";
		StringBuffer br = new StringBuffer(str);
		br.reverse();
		System.out.println(br);
		//-----------------------------------------------
		
		String str1 = "Hi hello How are ?";
		StringBuffer br1 = new StringBuffer(str1);
		System.out.println(br1);
		
		for(int i =0 ; i < br1.length()/2; i++) {
			char ch = br1.charAt(i);
			br1.setCharAt(i, br1.charAt(br1.length()-1-i));
			br1.setCharAt(br1.length()-1-i, ch);
		}
		System.out.println(br1);
	}
}
