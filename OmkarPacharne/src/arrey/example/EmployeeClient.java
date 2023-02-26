package arrey.example;

public class EmployeeClient {
	
	
	public static void main(String[] args) {
		
		Employee[]arr=new Employee[3];
		Employee e = new Employee ();
		e.setEmpid(1);
		e.setName("aakash");
		arr[0]=e;
		
		Employee e1 =new Employee (2,"aatharv");
		arr[1]=e1;
		
		arr[2]=new Employee();
		arr[2].setEmpid(3);
		arr[2].setName("ashish");

	 // for (int i = 0; i <= arr.length; i++) {
    //      System.out.println(arr[0].getEmpid());
	    //.out.println(arr[0].getName());
          EmployeeClient.printEmployeeData(arr);
	  }
	
public static void printEmployeeData(Employee[]arr) {
	
	System.out.println(arr[0].getEmpid());
	System.out.println(arr[0].getName());
	System.out.println(arr[1].getEmpid());
	System.out.println(arr[1].getName());
	System.err.println(arr[2].getEmpid());
	System.out.println(arr[2].getName());
	


}}