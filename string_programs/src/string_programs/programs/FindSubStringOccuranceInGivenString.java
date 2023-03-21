package string_programs.programs;

public class FindSubStringOccuranceInGivenString {

	public static void main(String[] args) {
		
		
		String str = "ababaaaababaabababaab";
		String subStr = "ab";
		 
		int count = 0;
		
		for (int i = 0; i + subStr.length() <= str.length(); i++) {
						
			if(str.substring(i,i+subStr.length()).equals(subStr)) {
				count++;
			}
		}
	
		System.out.println(count);
		
		
	}
}
