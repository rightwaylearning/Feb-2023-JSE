package string_programs.programs;

 class PalindromString {

	 public static void main(String[] args) {
		
		 String str = "madam";
		 if(new StringBuffer(str).reverse().toString().equals(str)) {
			 System.out.println("YES");
		 }else {
			 System.out.println("No");
		 }
	}
}
