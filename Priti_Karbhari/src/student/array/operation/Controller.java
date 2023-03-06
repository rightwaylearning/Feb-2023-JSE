package student.array.operation;

//import student_array_operation.PrinterUtility;

public class Controller {
	
	public static void main(String[] args) {
		 Employee[] arr = new Employee[4];
		 
		// int i =0;
		 
		 Employee e1 = new Employee();
		 e1.setEmployeeName("priti");
		 e1.setEmployeeNumber(37);
		 e1.setEmployeeSalary(805000.00);
		 arr[0] = e1;
		 
		 Employee e2 = new Employee("rahul" , 19,905000.00);
		 arr[1] = e2;
		 
		 arr[2] = new Employee("amol",22,995000.00);
		 
		  arr[3] = new Employee();
		  arr[3].setEmployeeName("mahadev");
		  arr[3].setEmployeeNumber(23);
		  arr[3].setEmployeeSalary(70500.00);
		  
		  System.out.println("before salary increment");
		  
		    PrinterUtility.print(arr);
		    
		   int i = 0;
		   
		   while(i < arr.length) {
			   double presentSalary = arr[i].getEmployeeSalary() + (arr[i].getEmployeeSalary()*10/100);
			   arr[i].setEmployeeSalary(presentSalary);
			   
			   
			   //System.out.println("Salary increament  " + presentSalary);
			   i++;
		   }
		    
		    System.out.println("after salary increment");
			   

		    PrinterUtility.print(arr);
	}
}
