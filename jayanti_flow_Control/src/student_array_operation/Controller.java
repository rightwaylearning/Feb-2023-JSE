package student_array_operation;

public class Controller {
	
	public static void main(String[] args) {
		
		Employee[] arr = new Employee[4];
		
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Pranali Rokade");
		e1.setEmployeeSalary(35500.00);
		arr[0] = e1;
		//................................
		
		Employee e2 = new Employee(2, "Shivani Satav", 25000.00);
		arr[1]=e2;
		//................................
		
		arr[2] = new Employee(3, "Budhavati Jadhav", 30000.00);
		//..............................
		
		arr[3] = new Employee();
		
			arr[3].setEmployeeId(4);
			arr[3].setEmployeeName("Poonam Pawar");
			arr[3].setEmployeeSalary(20000.00);
		//..........................
	
			System.out.println("Before salary increment");
		    PrinterUtility.print(arr);
		    
		    double sal;
		     sal=e1.getEmployeeSalary();
		    e1.setEmployeeSalary(sal+(sal*10/100));
		    
		    sal=e2.getEmployeeSalary();
		    e2.setEmployeeSalary(sal+(sal*10/100));
		    
		    sal=arr[2].getEmployeeSalary();
		    arr[2].setEmployeeSalary(sal+(sal*10/100));
		    
		    sal=arr[3].getEmployeeSalary();
		    arr[3].setEmployeeSalary(sal+(sal*10/100));
		    
		    System.out.println("After salary increment");
		    PrinterUtility.print(arr);
		    
	}

}
