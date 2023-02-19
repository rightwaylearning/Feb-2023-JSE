package setter_and_getter;

public class Controller {

	public static void main(String[] args) {
		Emlployee e=new Emlployee();
		e.setEmpId(23);
		int a=e.getEmpId();
		System.out.println(a);
		
		e.setempname("sayali");
		String s=e.getempName();
		System.out.println(s);		
	}
}
