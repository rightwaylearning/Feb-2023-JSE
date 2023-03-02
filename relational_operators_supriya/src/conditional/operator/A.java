package conditional.operator;

public class A {

	public static void main(String[] args) {
		int a=10;
		int b=2022;
		int c=50;
		
		/*if(a>b && a>c) {
			System.out.println("a is big element"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is big element"+b);
			 {
			 else {
				 System.out.println("c is big element");
			 }
			 }
			 }
		}
	
	}
*/
int result=(a>b && a>c)?a:(b>a && b>c)?b:c;
System.out.println("big element is"+result);
}
	}