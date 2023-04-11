package string_programs.programs;

public class FindOutGivenCharacterCountInString {

	public static void main(String[] args) {
		
		String str = "Hi hhello kk hhhh oo";
		str = str.toLowerCase();
		char inputChar = 'h';
		
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == inputChar) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
