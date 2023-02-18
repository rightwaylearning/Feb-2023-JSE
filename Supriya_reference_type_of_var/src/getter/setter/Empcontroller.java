package getter.setter;

public class Empcontroller {

	public static void main(String[] args) {
		
		Employee e =new Employee();
		e.setEmpId(10);
		e.setEmpName("Ganesh");
		e.setEmpAddress("ABC chowk");
		
		System.out.println(e.getEmpAddress());
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
	}
}

