package string_class.methods;

public class Sample {

	public static void main(String[] args) {
		
		String str = "  hello hi      hello     ";
		String result  = str.trim();
		
		System.out.println(str);
		System.out.println(result);
		
		
		String str1= "      hello   ";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		
		
		
		//----------------------------------------------
		System.out.println("-------------------------------------");
		
		String str2 = "hello";
		String str3 = str2.trim();
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		
		//----------------------------------------------------
		
		String s1 = "hello";
		
		String s2 = s1.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String h1 = "MI";
		
		String h2 = h1.toLowerCase();
		
		System.out.println(h1);
		System.out.println(h2);
		
		//------------------------------------
		String k1= "rwl";
		String k2 = k1.toLowerCase();
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		
		//----------------------------------------------
		
		
		String rwl = new String("Right Way Learning!!");
		rwl = rwl.intern();
		String k11 = "Right Way Learning!!";
		System.out.println(rwl==k11);
		
		
		
		
	}
}
