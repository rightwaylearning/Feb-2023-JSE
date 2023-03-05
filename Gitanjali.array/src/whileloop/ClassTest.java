package whileloop;

public class ClassTest {
	public static void main(String[] args) {
		int num = 2;
		while (num <= 10) {
			System.out.println(num*5);
			num++;
			System.out.println(">>>>>>>>>>>>>>>>" + num);

			while (num <= 10) {
				num = 5;
				System.out.println(num);
				num++;
				System.out.println(">>>>>>>>>>>>>>>>>" + num);

			}

		}
	}
}
