package while_loop_using_project;

public class PrintUtility 
{
	public static void printEmployeeInfo(Employee[] arr)
	{
		int index=0;
		while(index <arr.length)
		{
			System.out.println(arr[index].getEmployeeNumber());
			System.out.println(arr[index].getEmployeeName());
			System.out.println(arr[index].getEmployeeSalary());
			System.out.println("--------------------------------------");
			index++;
		}
		
		
	}
	

}
