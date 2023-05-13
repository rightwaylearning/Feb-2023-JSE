package thread.creation;

class MyWork {

	void m1() {

        for(int i =1; i<=100; i++) {
        	System.out.println(i);
        }
	}
}

public class Test {

	public static void main(String[] args) {
	

		MyWork work = new MyWork();
		
		
		
		
		work.m1();
		
	}
}










