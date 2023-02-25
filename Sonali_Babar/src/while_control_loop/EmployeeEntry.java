package while_control_loop;

public class EmployeeEntry 
{
	public static void main(String[] args) 
	{
		Employee[] arr=new Employee[4];
		
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("Sonali");
		arr[0]=e;
		
		Employee e2=new Employee(102,"Snehal");
		arr[1]=e2;
		
		arr[2]=new Employee(103,"Sakshi");
		
		arr[3]=new Employee();
		arr[3].setEmpId(104);
		arr[3].setEmpName("Radhika");
		
		
		EmployeeEntry.printEmployeeData(arr);
		
		
	}
	public static void printEmployeeData(Employee[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i].getEmpId());
			System.out.println(arr[i].getEmpName());
			System.out.println("*************************");
			i++;
		}
	
	}

}
