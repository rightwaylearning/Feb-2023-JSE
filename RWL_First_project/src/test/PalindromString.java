package test;

public class PalindromString {
	public static void main(String[] args) {
		
		String str = "madam";
		String rev="";
		for(int i = str.length()-1;  i>=0 ;i--) {
			
			char ch = str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Given String is palindrom");
			
		}else {
			System.out.println("Given string is not palindrom");
		}
		
	}

}
