package string_programs.programs;

public class CountWordCharacterSpaceInGivenLine {

	public static void main(String[] args) {
		
		String str = "Hi hello   good mornin ?";
		
		char[] arr = str.toCharArray();
		
		int cnt = 0;
		int space =0 ;
		
		for (char ch : arr) {
			if((ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z')) {
				cnt++;
			}
			if(ch == ' ') {
				space++;
			}
		}
		
		System.out.println("character = "+cnt);
		System.out.println("space = "+space);
		// alphabets = 17
		// space = 4
		// word = 4
		
	
		String[] str1 = str.split(" ");
		int word =0;
		for (String s : str1) {
			boolean flag = true;
			char[] charAaray = s.toCharArray();
			
			for(char ch:charAaray) {
				if((ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z')) {
					
				}else {
					flag = false;
					break;
				}
			}
			if(flag && charAaray.length >= 1) {
				word++;
			}
		}
		System.out.println("word  = " +word);
		
	}
}
