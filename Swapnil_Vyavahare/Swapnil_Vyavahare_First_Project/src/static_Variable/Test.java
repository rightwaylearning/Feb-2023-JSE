package static_Variable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.employeeName= "Swapnil";
		e.employeetAge=23;
		//e.employeeCompany="Pans Tech";
		Employee.employeeCompany="Pans Tech";
		
		Employee e1 = new Employee();
		e1.employeeName ="Rohan";
		e1.employeetAge=18;
		
		System.out.println(Employee.employeeCompany);
		System.out.println(Employee.employeeCompany);
		

	}

}
