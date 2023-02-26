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
		 
		 
		int i = 0;
		  
		  while(i < emp.length){
			 
			  System.out.println("employee id = "+emp[i].getEmpid());
			  System.out.println("employee name = "+emp[i].getName());
			  System.out.println("company name = "+emp[i].getCompany());
			  System.out.println(".................+........+...........");
			  
			  i++;
	     }
	
   }
		    
}                                                           
