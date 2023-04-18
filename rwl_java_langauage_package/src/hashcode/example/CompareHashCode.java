package hashcode.example;


class Test{
	int num;
}

public class CompareHashCode {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.num = 10;
		
		Test t2= new Test();
		t2.num = 20;
		t2=t1;
		
		Test t3 = new Test();
		t3.num = 10;
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}
}
