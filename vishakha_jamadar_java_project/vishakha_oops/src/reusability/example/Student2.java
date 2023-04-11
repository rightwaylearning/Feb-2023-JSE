package reusability.example;

public class Student2 {
	void doMyopt( int y ,int z){
		Maths m= new Maths();
		int r=m.product(y,z);
		System.out.println("HAS-A-reln");
		
	}

}
