package vriables.practice;

public class Variables {
	int a;
	int b;
	
	void m1(int b)
	{
		int a=10;    
		 b=20;
		this.a=100;
		a=this.a;
		a=2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
	/*a=88/10/100/2
	b=20/
	this.a=99/100
	this.b=999*/
	
	/*public static void main(String[] args) {
		 Variables obj=new Variables();
		 obj.a=99;
		 obj.b=999;
		 obj.m1(88);*/

}
