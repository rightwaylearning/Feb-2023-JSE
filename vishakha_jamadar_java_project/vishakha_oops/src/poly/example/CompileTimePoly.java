package poly.example;
class  Example{
	void m1(int a, int b){
		System.out.println("int,int");
	}
	void m1(byte c ,byte d) {
		System.out.println("byte,byte");
	}
	void m1(double d1 ,double d2) {
		System.out.println("double,double");
	}
	
}

public class CompileTimePoly {
	public static void main(String[] args) {
		Example e=new Example();
		e.m1(36f,78f);
		e.m1(78, 870);
		e.m1('A','D');
	}

}
