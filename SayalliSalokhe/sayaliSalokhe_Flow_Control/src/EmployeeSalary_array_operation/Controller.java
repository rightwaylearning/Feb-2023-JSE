package EmployeeSalary_array_operation;

public class Controller {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[4];
		
		Employee e1= new Employee();
			e1.setEmployeeName("raghu");
			e1.setEmployeeNumber(23);
			e1.setEmployeeSalary(234500.00);
	    arr[0] = e1;
	    //---------------------------------------------
	    
	    Employee e2 = new Employee(24,"Shrikant",456700.00);
	    arr[1] = e2;
	    
	    //------------------------------------------------
	    
	    arr[2] = new Employee(25,"Raju",78906.00);
		
	    //================================================
	    
	    arr[3] = new Employee();
		    arr[3].setEmployeeName("rajlaxmi");
		    arr[3].setEmployeeNumber(45);
		    arr[3].setEmployeeSalary(34567.90);
		//--------------------------------------------------    
		    System.out.println("before salary increment");
		    PrinterUtility.print(arr);
		   
		    
		    // write ur logic here ,>> increment salary of employee by 10% on current salary
		    
		    
		    System.out.println("after salary increment");
		    PrinterUtility.increaseSalary(arr);
		    
	}
}
