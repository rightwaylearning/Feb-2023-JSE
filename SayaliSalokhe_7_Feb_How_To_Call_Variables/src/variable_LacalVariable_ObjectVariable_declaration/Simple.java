package variable_LacalVariable_ObjectVariable_declaration;

public class Simple {
	public int a;
	public int b;
	
	public void m1(Simple obj)
	{
		int a=100;
		int b=200;
		System.out.println("local variable a:"+a);//this is local variable a=100
		System.out.println("object variable a:"+obj.a);//this is object variable b=10
		System.out.println("local variable:"+b);//this is local variable b=200
		System.out.println("object variable b:"+obj.b);//this is object variable b=20
	}


}
