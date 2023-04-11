package number_programs;

public class FindoutArmstrongNumberInbetween1_to_1000 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10000; i++) {
			int num = i;
			int numCopy = num;
			int sum = 0;
			while (num > 0) {
				int r = num % 10;
				sum = sum + r * r * r;
				num = num / 10;
			}

			if (numCopy == sum) {
				System.out.println(numCopy);
			}
		}
	}
}
