package while_Loop_Program;

public class PrintNoReminder {
	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			if (i % 2 == 1) {
				i++;

			}
			System.out.println(i);
			i++;

		}
		System.out.println(i);
	}

}
