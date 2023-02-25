package arrays;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[4];
		
		Employee e = new Employee();
		 e.setEmpid(123);
		 e.setName("suresh");
		 e.setCompany("TCS");
		 emp[0]=e;
		 
		 Employee e1 = new Employee (235,"Vaibhav","Infosys");
		 emp[1]=e1;
		 
		 emp[2] = new Employee();
		 emp[2].setEmpid(365);
		 emp[2].setName("Sarthak");
		 emp[2].setCompany("IBM");
		 
		 
		 
		 emp[3]= new Employee(486,"Sunder","Amazon");
		 
		 EmployeeTest.PrintEmp(emp);
		 
		int i=0;
		while(i<=3) {
			System.out.println(emp.length);
		}
		 
		
	}
	
	public static void PrintEmp(Employee[] emp) {
		System.out.println(emp[0].getEmpid());
		System.out.println(emp[0].getName());
		System.out.println(emp[0].getCompany());
		
	}

}
