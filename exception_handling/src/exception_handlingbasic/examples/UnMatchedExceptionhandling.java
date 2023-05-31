package exception_handlingbasic.examples;

public class UnMatchedExceptionhandling {

	public static void main(String[] args) {
        System.out.println("strat point");		
		Employee e = Employee.getObject();
		try {
		e.printEmployeeInfo(); 
		}
		catch (Error e2) {      
			
		}
		System.out.println("end point");
		// Error e =new NullPointerException();
	}
}


class Employee{
	
	void printEmployeeInfo() {
		
		System.out.println("info");
	}
	
	static Employee getObject() {
		return null;
	}
	
}
