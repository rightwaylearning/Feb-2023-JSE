package interface_example;

interface Parent123{
	void m1();
}
class Child123 implements Parent123{
	@Override
	public void m1() {
			
	}
}

public class Parent {

	public static void main(String[] args) {
		
		// case 1
	//	Parent123 c1= new Parent123();
		
		// case 2
		Child123 c1= new Child123();
		
		
		// case 3
		Parent123 p1= new Child123();
	
		
		// case 4
		
		
	}
}
