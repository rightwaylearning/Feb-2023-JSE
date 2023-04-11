package test;


abstract class M{
	int a;
	int b;
		
	abstract void m1();
	
	void m2() {
		// -----
	}
}


public interface Test {
    int a = 90; // public final static 
    int b = 20; // public final static 
	
	 void m1();  // public abstract void m1();
}

class TestImpl implements Test{
	
	public void m1() {
		
	}
}
