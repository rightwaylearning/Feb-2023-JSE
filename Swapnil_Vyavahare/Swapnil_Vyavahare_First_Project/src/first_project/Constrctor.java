package first_project;

public class Constrctor {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b1;

	String str;
	StringTravel str1;

	public Constrctor(int a) {
		System.out.println("I am one parameter constructor");
		System.out.println(a);
	}

	public Constrctor(int a, int b) {
		System.out.println("I am 2 parameterized constructor");
		System.out.println(a);
		System.out.println(b);
	}

	public Constrctor(int a, int b, int c) {
		System.out.println("I am 3 parametrized constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public Constrctor() {
		// TODO Auto-generated constructor stub
	}

	public void m1() {

		System.out.println("Defaul Value of byte  =" + b);
		System.out.println("Defaul Value of short  =" + s);
		System.out.println("Defaul Value of int  =" + i);
		System.out.println("Defaul Value of long  =" + l);
		System.out.println("Defaul Value of float  =" + f);
		System.out.println("Defaul Value of double  =" + d);
		System.out.println("Defaul Value of char  =" + c);
		System.out.println("Defaul Value of boolean  =" + b1);
		System.out.println("Defaul Value of reference predefine  =" + str);
		System.out.println("Defaul Value of reference userdefine  =" + str1);

	}

}
