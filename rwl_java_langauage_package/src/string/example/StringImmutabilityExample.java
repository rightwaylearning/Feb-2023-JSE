package string.example;

public class StringImmutabilityExample {

	public static void main(String[] args) {
		
		
		String str = "Hello";
		String str1= new String("Hello");
		String str2="Hello";
		
		System.out.println(str ==str1); // false
		
		System.out.println(str1 ==str2); // false

	    System.out.println(str ==str2 ); // true
	}
}
