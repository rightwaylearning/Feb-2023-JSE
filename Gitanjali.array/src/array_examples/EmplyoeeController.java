package array_examples;

public class EmplyoeeController {
	public static void main(String[] args) {
		Emplyoee[] arr = new Emplyoee[5];
		Emplyoee e = new Emplyoee(26, "Sarthak");
		arr[0] = e;
		Emplyoee e1 = new Emplyoee(25, "Shivansh");
		arr[1] = e1;
		Emplyoee e2 = new Emplyoee(23, "Yogesh");
		arr[2] = e2;
		Emplyoee e3 = new Emplyoee(22, "Akash");
		arr[3] = e3;
		Emplyoee e4 = new Emplyoee(21, "Advik");
		arr[4] = e3;
		int i = 5;
		while (i < arr.length) {
			System.out.println(arr[1].getEmpId());
			System.out.println(arr[1].getEmpName());
		}

	}
}
