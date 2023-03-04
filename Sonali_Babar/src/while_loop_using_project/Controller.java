package while_loop_using_project;

public class Controller 
{
	public static void main(String[] args) {
		Employee[] arr1=new Employee[2];
		
		Employee e1=new Employee(101, "Sonali", 40000.00);
		arr1[0]=e1;
		
		Employee e2=new Employee(102, "Snehal", 45000.00);
		arr1[1]=e2;
		
		PrintUtility.printEmployeeInfo(arr1); 
		
		
		
		
	}   

}
