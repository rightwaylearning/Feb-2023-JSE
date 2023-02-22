package logical_operator;

public class Test1 {
	public static void main(String[] args) {

		int a = 10;
		int b = 13;
	
	if(++a == 10 && ++b == 15)  {
		System.out.println("I M True part");
		++a;
		++b;
	
	} else {
		System.out.println("I M False Part");
		
	}
	
	System.out.println(a); 
	System.out.println(b); 
	
	
	}
	

}
