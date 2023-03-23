package reusability;

public class Entrypoint {
    
	public static void main(String[] args) {
	

	Student1 s = new Student1();
	   s.doSum(10, 20);
	  
	Student2 s1 = new Student2();
	   s1.doMysum(100, 200);
	 
	}
}
