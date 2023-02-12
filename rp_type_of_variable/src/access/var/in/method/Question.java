package access.var.in.method;

public class Question {
	
	int a=21 ;
	
	public static void main(String[] args) {
		
//		System.out.println(a);
		
//	we can not access the instance var in static method
//		and if you want to access tari pn tr create object
		
		Question q = new Question();
		
		System.out.println(q.a);
		
		
	}

}
