package array_example;

public class EmployeDetails {
	
	public static void main(String[] args) {
		
	Employee[]arr = new Employee[3];
	
	arr[0] = new Employee(10,"A");
	arr[1] = new Employee(20,"B");
	arr[2] = new Employee(30,"C");
	
	
	
	EmployeDetails.printEmployeeData(arr);
	}
	
	 public static void printEmployeeData(Employee[] arr) {
	    	
	    	System.out.println(arr[0].getEname());
	    	System.out.println(arr[0].getEid());
	    	
	    	System.out.println(arr[1].getEname());
	    	System.out.println(arr[1].getEid());
	    	
	    	System.out.println(arr[2].getEname());
	    	System.out.println(arr[2].getEid());
	    	
	    	
	    	
	    }	
}
