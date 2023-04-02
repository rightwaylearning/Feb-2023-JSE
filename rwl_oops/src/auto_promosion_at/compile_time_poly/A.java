package auto_promosion_at.compile_time_poly;
class Test{
    void m1(int a) {
    	System.out.println("int");
    }
    void m1(int a, float b) {
    	System.out.println("int,float");
    }
    void m1(float f, float b) {
    	System.out.println("float,flaot");
    }
    void m1(float a, int b) {
    	System.out.println("float,int");
    }
}
public class A {

	public static void main(String[] args) {
		Test t= new Test();

		//t.m1(10.5F,'A');
		
		//t.m1(10.20,23.89);
		// t.m1(10,20);
		//t.m1('A');
	}
}
