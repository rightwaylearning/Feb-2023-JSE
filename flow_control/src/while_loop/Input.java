package while_loop;

import java.security.DomainCombiner;

public class Input {

	public static void print (Employee[] emp) {
		int i = 0;
		
		while(i<emp.length) {
			
			System.out.println("Employee Number is "+emp[i].getEmpNumber());
			System.out.println("Employee Name is "+emp[i].getEmpName());
			System.out.println("Employee Salary is "+emp[i].getEmpSalary());
			
			System.out.println("Employees get 10% increment in next month =  "+emp[i].getEmpSalary()/100*10);
		
			System.out.println("----------Total Salary (with increment)-------------");
			
			System.out.println(emp[i].getEmpSalary()+emp[i].getEmpSalary()/100*10);
			
			i++;
			System.out.println("+++++++++++++++++++++++++");
			
			}
		
		
	
		
	       
	      
		
		
	}
	
}
