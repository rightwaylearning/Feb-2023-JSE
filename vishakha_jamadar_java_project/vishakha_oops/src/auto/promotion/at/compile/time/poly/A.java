package auto.promotion.at.compile.time.poly;

class Test{
	void m1 (int i){
		System.out.println("int ");
	}
	void m1(int a ,float b){
		System.out.println("int i ,float f");
	}
	void m1(float c,int d){
		System.out.println("float f,int i");
	}
	void m1(float e,float f) {
		System.out.println("float ,float");
	}
}



public class A {
	public static void main(String[] args) {
	Test t=new Test();
	t.m1(22 ,57f);
	t.m1( 88.6f ,89.2f);
	}
}
