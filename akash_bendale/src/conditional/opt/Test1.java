package conditional.opt;

public class Test1 {
	public static void main(String[] args) {
		 int a=100 , b=300, c=400;
		 if(a>b && a>c);
		 	System.out.println("a is big element" +a);
	} else if(b>a && b>c);{
			System.out.println("b is big element" +b);
	} else {
		System.out.println("c is big element" + c);
	}
	
}
