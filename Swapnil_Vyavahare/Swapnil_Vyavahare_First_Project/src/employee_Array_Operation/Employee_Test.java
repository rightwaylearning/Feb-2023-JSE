package employee_Array_Operation;

public class Employee_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] arr = new Employee[4];

		// first way of declaring array
		Employee e1 = new Employee();
		e1.setEmpId(10);
		e1.setEmpName("Swapnil S Vyavahare");
		e1.setEmpSalary(30000.00);

		arr[0] = e1;

		// second way of declaring array
		Employee e2 = new Employee(20, "Rohan", 31000.00);
		arr[1] = e2;

		// Third way way to initiate
		Employee e3 = new Employee();
		e3.setEmpId(30);
		e3.setEmpName("amol");
		e3.setEmpSalary(25000.00);

		arr[2] = e3;

		// fourth Way to initilize array
		arr[3] = new Employee();
		arr[3].setEmpId(40);
		arr[3].setEmpName("ganesh");
		arr[3].setEmpSalary(10000.00);
		
		
		System.out.println("Before Increment");
		Printer.printdata(arr);
		
		System.out.println("  ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("After Increment");
		Printer.updatedsalary(arr);
		

	}

}
