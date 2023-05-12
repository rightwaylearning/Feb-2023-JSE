package string.class_methods;

public class Allmethods {

	public static void main(String[] args) {
		
		String str ="hi hello how are you?";
		//length = 21  >> valid index  0 to 20
		
		// length() is one method return number of character present inside string including space also
		int leng = str.length();
		
		System.out.println(leng);
		
		
		//-----------------------------------------------------------
		
		char ch = str.charAt(3);
		System.out.println(ch);
		//System.out.println(str.charAt(24));
		
		//-----------------------------------------------------------
		
		// concat
		
		String str1= "hello";
		String output = str1.concat(" how are you?");
		System.out.println(output);
		
		//--------------------------------------------------
		// equals
		System.out.println("======================================");
		
		StringBuffer br=  new StringBuffer("hello");
		StringBuffer br1=  new StringBuffer("hello");
		System.out.println(br.equals(br1)); // false
		System.out.println(br == br1);  // false
		
		String s1= new String("hello");
		String s2= new String("hello");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1==s2); // false
		
		String s3 ="hello";
		String s4 ="hello";
		System.out.println(s3.equals(s4));  // true
		System.out.println(s3 == s4); // true
		
		//-----------------------------------------------------------
		
		// equalsIgnoreCase
		System.out.println("&&&&&&&&&&&&&&&&");
		String str3 = "java";
		String str4 = "Java";
		System.out.println(str3.equalsIgnoreCase(str4));
		
		//----------------------------------------------------------
		// trim
		String str5 = "   hi    hello hi    hello   ";
		System.out.println(str5.trim());
		
		//----------------------------------------------------------
		// substring
		String str8 = "hi how are you?";
		System.out.println(str8.substring(3));
		
			
	}
}
