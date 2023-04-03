package employee_Array_Operation;

public class Printer {

	public static void printdata(Employee[] arr) {

		int index = 0;

		while (index < arr.length) {
			System.out.println(arr[index].getEmpId());
			System.out.println(arr[index].getEmpName());
			System.out.println(arr[index].getEmpSalary());
			System.out.println(">>>>>>>>>>.............>>>>>>>>>>");
			index++;
		}

	}

	public static void updatedsalary(Employee[] arr) {
		int index1 = 0;

		while (index1 < arr.length) {

			double salary = arr[index1].getEmpSalary() + arr[index1].getEmpSalary() * 0.1;

			arr[index1].setEmpSalary(salary);
			System.out.println("Empoyee ID =" + arr[index1].getEmpId());
			System.out.println("hi " + arr[index1].getEmpName() + " Congratulation ");
			System.out.println("Congratulation you get promoted as manager and your monthly salary = "
					+ arr[index1].getEmpSalary());
			System.out.println(">>>>>>>>>>.............>>>>>>>>>>");

			index1++;
		}

	}

}
