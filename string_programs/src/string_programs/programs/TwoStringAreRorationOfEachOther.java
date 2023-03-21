package string_programs.programs;

public class TwoStringAreRorationOfEachOther {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		String str2 = "cdab";
		
		int match  = 2;
		
		String r = str2.substring(match, str2.length()) + str2.substring(0,match);
		System.out.println(r);
	}
}
