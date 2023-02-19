package increment.decrement;

public class Test2 {
	public static void main(String[] args) {
		int a=12;
		int b=10;
	
	int	c= a++ + --b + --a + b++;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	
System.out.println("=================================================");

int x=14;
int y=16;
 
int z=y-- + x-- + y-- + x++;
System.out.println(x);
System.out.println(y);
System.out.println(z);

		
	}

}
