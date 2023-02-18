package instance_method_call_rule;

public class Class_A {
	int a;
	int b;
	void m1()
	{
		System.out.println("i am instance method m1 ");
		m2();
	}
	void m2()
	{
		System.out.println("i am a instance method m2");
	}

}
