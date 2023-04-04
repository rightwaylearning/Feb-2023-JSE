package methodSignature;

public class A {
	void m1(int a, int b) // method signature m1(int,int)
	{

	}

	/*
	 * Duplicate method m1(int, int) in type A void m1(int a, int b) {
	 * 
	 * }
	 */

	void m2(String n, String m, int a) // m2(string,string,int)
	{

	}

	void m1(int a, float c) // m1(int,float)
	{

	}

	void m3(int n, float m) // m3(int,float)
	{

	}

	void m3(float m, int n) // m3(float,int)
	{

	}
//---------------------------------------------------------------
	//Duplicate method m4(int, int) in type A

	/*
	 * void m4(int n, int m) // m3(int,float) {
	 * 
	 * }
	 * 
	 * int m4(int m, int n) // m3(float,int) {
	 * return ;
	 * 
	 * }
	 */

}
