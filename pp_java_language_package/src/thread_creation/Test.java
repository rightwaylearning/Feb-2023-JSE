package thread_creation;

class MYwork{
	
	void m1() {
		for(int i=0; i<=100;i++) {
			System.out.println(i);
		}
	}
}

public class Test {
	
	public static void main(String[] args) {
		MYwork work=new MYwork();
		
		work.m1();
		
	}

}
