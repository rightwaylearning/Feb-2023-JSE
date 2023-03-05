package array_example;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee [] arr = new Employee[4];
		
		//+++++++++++++++++++++++++++++++
		
		 Employee e = new Employee ();
		     e.setRollNumber(10);
		     e.setName("Archana");
		     e.setSalary(35000.00);
		     arr[0] = e;
		     
	     //++++++++++++++++++++++++++++++
		     
		   Employee e1 = new Employee(11,"Sharayu",55000.25);
		    arr[1] = e1;
		    
		//+++++++++++++++++++++++++++++++++++++++++++++++
		    arr[2] = new Employee(12,"Nilam",36000.55);
		    
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		    arr[3] = new Employee();
		      arr[3].setRollNumber(13);
		      arr[3].setName("Aryan");
		      arr[3].setSalary(87000.45);
		      
		      EmployeeClient.printEmployeeData(arr);
		    
	}
	
	  public static void printEmployeeData(Employee[]arr) {
		System.out.println(arr[2].getRollNumber());
		System.out.println(arr[2].getName());
		System.out.println(arr[2].getSalary());
	}

}
