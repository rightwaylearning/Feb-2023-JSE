package identifier.pack;

public class EntryPoint {
	
public static void main(String[] args) {
	
	Simple s = new Simple();
	s.num1 = 12;
	s.num2 = 3;
	
	//how to create identifiers
//	a to z
//	A to Z
//	0 to 9 
//	$ and _
	s.sum();
	
	System.out.println(s.num1);
	System.out.println(s.num2);
	
	}

}
