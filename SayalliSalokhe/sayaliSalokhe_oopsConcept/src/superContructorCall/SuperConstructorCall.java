package superContructorCall;

class C1{
	int a;
	int b;
	C1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
}
class N extends C1
{

	N(int a, int b) {
		super(a, b);
		
	}
	}

public class SuperConstructorCall {
	public static void main(String[] args) {
		C1 c1=new C1(77, 98);
		
		
	}

}
