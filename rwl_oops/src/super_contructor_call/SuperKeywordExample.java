package super_contructor_call;

class Parent1{
	int a;
	int b;
	Parent1(int a, int b){
		this.a = a;
		this.b =b;
	}
}


class Child1 extends Parent1{
	
	int a;
	int b;
	
	Child1(int a, int b,int x,int y){
		super(x,y);
		this.a = a;
		this.b = b;
	}
	
	void m1() {
		int a = 10;
		int b= 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
}


public class SuperKeywordExample {

	public static void main(String[] args) {
		
		Child1 c= new Child1(100,200,1,2);
		c.m1();
	}
}
