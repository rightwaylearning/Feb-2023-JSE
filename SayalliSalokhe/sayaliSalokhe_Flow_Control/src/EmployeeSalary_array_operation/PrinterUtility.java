package EmployeeSalary_array_operation;

public class PrinterUtility {

	public static void print(Employee[] arr) {

		int index = 0;

		while (index < arr.length) {

			System.out.println(arr[index].getEmployeeNumber());
			System.out.println(arr[index].getEmployeeName());
			System.out.println(arr[index].getEmployeeSalary());

			index++;
			System.out.println("---------------------------");
		}
	}

	public static void increaseSalary(Employee[] arr) {
		int index = 0;
		double calculation = 0;
		double discountSalary = 0;
		double increaseSalary = 0;

		while (index < arr.length) {

			calculation = 10 * (arr[index].getEmployeeSalary());
			discountSalary = calculation / 100;
			increaseSalary = discountSalary + (arr[index].getEmployeeSalary());
			index++;

			System.out.println(increaseSalary);
			
		}
		System.out.println("---------------------------------------");
	}

}
