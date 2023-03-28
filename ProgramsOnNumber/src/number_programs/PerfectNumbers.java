package number_programs;

import java.util.Iterator;

public class PerfectNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			int sum = 0;
			
			for(int j = 1 ; j < i; j++) {
				
				if(i%j ==0) {
					sum = sum + j;
				}
				
			}
			
			if(i == sum) {
				System.out.println(i+ " it is perfect number");
			}
			
			
		}

	}
}
