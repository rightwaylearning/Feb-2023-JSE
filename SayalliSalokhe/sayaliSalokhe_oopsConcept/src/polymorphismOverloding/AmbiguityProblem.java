package polymorphismOverloding;

class Test5{
	
	void m1(float b, int a) {
		System.out.println("float-int match");
	}

	void m1(int a,float b) {
		System.out.println("int-float match");
	}
}
public class AmbiguityProblem {
	public static void main(String[] args) {
		Test5 t5=new Test5();
		//t5.m1(10,10); //The method m1(float, int) is ambiguous for the type Test5
		//t5.m1((15.87f, 12.78f); //he method m1(float, int) in the type Test5 is not applicable for the arguments (float, float)
		
	}

}
