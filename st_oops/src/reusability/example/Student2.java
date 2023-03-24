package reusability.example;

public class Student2 {
	
	void doMyOpt(int x, int y) {
		Maths m = new Maths();
		int r = m.product(x , y);
		System.out.println("Has-A-Reln "+r);
	}

}
