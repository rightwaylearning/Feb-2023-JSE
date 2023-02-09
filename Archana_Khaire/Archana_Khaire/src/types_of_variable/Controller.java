package types_of_variable;

public class Controller {
	
	public static void main(String[] args) {
		Testing t = new Testing();
		t.a = 20;
		t.b = 10;
		t.c = 100;
		
		
		Testing t1 = new Testing();
		t1.a = 25;
		t1.b = 5;
		t1. c = 200;
		Testing .c = 300;
		
		Testing t3 = new Testing();
		t3.a = 55;
		t3.b = 1;
		
		System.out.println(t.a);// 20
		System.out.println(t3.c); // 300

		
	}

}
