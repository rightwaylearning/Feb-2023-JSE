package reusability;

public class Student1 extends Sum{

	void doSum(int a, int b) {
		
		int r = sum(a,b);
		System.out.println(r);
	}

}
