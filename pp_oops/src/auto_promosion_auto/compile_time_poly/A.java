package auto_promosion_auto.compile_time_poly;

class Test{
	void m1(int a) {
		System.out.println("int");
	}
	
	void m1(int a,float b) {
		System.out.println("int,float");
	}
	
	void m1(float f, float b) {
		System.out.println("float, float");
	}
	
	void m1(float a, int b) {
		System.out.println("float,int");
	}
}


public class A {
	
	public static void main(String[] args) {
		Test t= new Test();
		
		t.m1(10.23F,'A'); // float,int (char not match is convert to int)
		
		//t.m1(10.20,23.89);it's compile time error beacuse doesnr exactly match or auto-promision is not apply it is a double,double method.
		
		//t.m1(10,20)// it's compile time error because its confuse to run for int,float or float,int
		
		t.m1('A');   //int (char is not exactly match so auto-promision method apply so char convert int
	}

}
