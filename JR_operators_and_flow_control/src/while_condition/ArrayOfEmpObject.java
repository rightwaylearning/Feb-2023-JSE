package while_condition;

public class ArrayOfEmpObject {

	public static void main(String[] args) {
		
		
		
		
		//Parameterise constructor object
		Employee e1=new Employee(11,"Pranali",25000);
		
		//Setter Object
		Employee e2=new Employee();
		e2.setEmpId(12);
		e2.setEmpName("Jayanti");
		e2.setSalary(30000);
		
		//Parameterise object
		
		Employee e3=new Employee(13,"Shivani",25000);
		
		//Setter object
		Employee e4=new Employee();
		
		e4.setEmpId(14);
		e4.setEmpName("Budhi");
		e4.setSalary(40000);
		
		
		//Array
		Employee empArr[]=new Employee[4];
		
		empArr[0]=e1;
		empArr[1]=e2;
		empArr[2]=e3;
		empArr[3]=e4;
		
		
		int i=0;
	
		while(i<4) {
			
			System.out.println("ID: "+empArr[i].getEmpId());
			System.out.println("Name: "+empArr[i].getEmpName());
			System.out.println("Salary: "+empArr[i].getSalary());
			System.out.println("____________________");
			i++;
		}
		
		
		
		
	}
}
