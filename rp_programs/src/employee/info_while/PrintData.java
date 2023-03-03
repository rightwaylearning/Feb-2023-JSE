package employee.info_while;

public class PrintData {
	
	public static void printer(Employee[] arr) {
		
//		Employee[] arr = new Employee[];
		
		int i = 0;
		
		while(i < arr.length) {
			
			System.out.println(arr[i].getEmployeeId());
			System.out.println(arr[i].getEmpName());
			System.out.println(arr[i].getEmpSalary());
			
			
			
			i++;
			
			System.out.println("<<<<<<<>>>>>>>>>>>");
		}
		
	}

}
