package first_project;

public class Test_Constructor {

	int i = 10;

	public static void main(String[] args) {
		Test_Constructor t = new Test_Constructor();

		Constrctor c = new Constrctor();
		Constrctor c1= new Constrctor(10);
		Constrctor c2= new Constrctor(10,20);
		Constrctor c3 = new Constrctor(10,20,30);

		System.out.println(t.i);
		System.out.println(c.i);
		c.m1();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
	}

}
