package string.example;

public class Test {

	public static void main(String[] args) {
		
		String str = new String("hello");

	    str.concat(" hi");
		
		System.out.println(str); // hello
		
		//---------------------------------
		
		StringBuffer br = new StringBuffer("hello");
		
		 br.append(" hi");
		 
		 System.out.println(br); // hello hi
		
		
	}
}
