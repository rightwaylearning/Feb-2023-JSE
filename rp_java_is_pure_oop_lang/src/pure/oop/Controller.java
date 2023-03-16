package pure.oop;

public class Controller {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
	   s1.setNo(-90);
	   Student s = new Student("name",1,new Address());
	   Integer e= s.getNo();
	  System.out.println(e);
	  
//	  data hiding process oops concept
	  
	  String str = String.valueOf("hello");
	}

}
