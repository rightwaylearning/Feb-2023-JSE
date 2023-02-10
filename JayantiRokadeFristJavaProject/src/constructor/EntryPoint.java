package constructor;

public class EntryPoint {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.employeeInfo();
		
		System.out.println("_______________________"
				);
		Employee e1=new Employee(11,"Pranali",45000.0);
		
		e1.employeeInfo();
	}

}
