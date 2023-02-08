package this_method;

public class Entry {
	
	public static void main(String[] args) {
		
		Test t = new Test ();
		t.a = 10;
		t.b = 20;
		
		Test t1 = new Test ();
		t1.a = 100;
		t1.b = 200;
		
		t.m1();
		t1.m1();
		
	}

}
