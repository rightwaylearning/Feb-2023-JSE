package setter.getter.method;

public class Entrypoint {
	public static void main(String[] args) {
		student s= new student ();
		s.setCname("Girls Highschool");
		s.setname("vishakha");
		s.setrollnum(20);
		System.out.println(s.getname());
		System.out.println(s.getrollnum());
		System.out.println(s.getCname());
	}
}
  
