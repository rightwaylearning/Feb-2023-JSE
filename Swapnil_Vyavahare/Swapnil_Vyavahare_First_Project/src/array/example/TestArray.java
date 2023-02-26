package array.example;



public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employee = new Employee[4];

		Employee e1 = new Employee();
		e1.setEmpID(1);
		e1.setEmployeeName("Swapnil");
		e1.setEmpSalary(10);

		employee[0] = e1;

		// Second Way

		Employee e2 = new Employee("Amol", 2, 20);

		employee[1] = e2;

		// third way

		employee[2] = new Employee();
		employee[2].setEmpID(3);
		employee[2].setEmployeeName("Sushant");
		employee[2].setEmpSalary(30);

		// fourth way

		employee[3] = new Employee("Rohan", 4, 40);
		
		TestArray.printStudentData(employee);

	}

	public static void printStudentData(Employee[] employees) {

		System.out.println(employees[0].getEmpID());
		System.out.println(employees[0].getEmployeeName());
		System.out.println(employees[0].getEmpSalary());
		
		System.out.println(">>>>>>>>>>>");

		System.out.println(employees[1].getEmpID());
		System.out.println(employees[1].getEmployeeName());
		System.out.println(employees[1].getEmpSalary());
		System.out.println(">>>>>>>>>>>");
		System.out.println(employees[2].getEmpID());
		System.out.println(employees[2].getEmployeeName());
		System.out.println(employees[2].getEmpSalary());
		System.out.println(">>>>>>>>>>>");
		System.out.println(employees[3].getEmpID());
		System.out.println(employees[3].getEmployeeName());
		System.out.println(employees[3].getEmpSalary());

	}

}
