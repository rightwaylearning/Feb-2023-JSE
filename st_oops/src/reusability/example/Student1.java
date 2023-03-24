package reusability.example;

public class Student1 extends Maths {
	
	void doOpt(int a , int b) {
		int r = product(a,b);
		System.out.println("IS-A-Relationship "+r);
	}

}
