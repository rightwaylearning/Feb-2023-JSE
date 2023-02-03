package employee.info;

public class EntryPoint {

	public static void main(String[] args) {
		
		EmployeeInfo e = new EmployeeInfo();
		
		Address a = new Address() ;
//		ya madhe fkt aapn method call keli capture nahi keli 
		
		        a.show(e);
		
		EmployeeInfo obj2 = a.emp();
		
		obj2.employeeName ="xyz";
		obj2.employeeId = 21;
		
		System.out.println(obj2.employeeId);
		
	}
}
