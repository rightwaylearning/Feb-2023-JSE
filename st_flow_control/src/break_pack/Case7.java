package break_pack;

public class Case7 {
	
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				if (i != j) {
					  System.out.println("("+i+" "+j+")");
				} else {
					continue; // this continue is applicable on inner loop
				}
				System.out.println("##");
			}
		}
	}


}
