package static_Instance_Block;

class Test{
	int a;
	static int b;
	
	{
		a=200;
		System.out.println("a:"+a);
		System.out.println("Instance block");
	}
	static {
		b=400;
		System.out.println("B:"+b);
		System.out.println("static lock");
	}
	
	Test()
	{
		System.out.println("no args constructor");
	}
	public Test(int a) {
		super();
		this.a = a;
		System.out.println(" args constructor");
	}

	void m2() {
		System.out.println("method m2 of class test");
	}
	
}
public class Static_And_Instatnce_Block {
	public static void main(String[] args) {
		Test test=new Test();
		test.m2();
		System.out.println("----------------------");
		Test test2=new Test(10);
		test2.m2();

	}
}
