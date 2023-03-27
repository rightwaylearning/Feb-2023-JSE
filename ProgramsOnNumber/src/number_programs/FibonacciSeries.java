package number_programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fisrt = 0; int second = 1;
		
		for(int i= 1; i<=10;i++) {
		   System.out.print(fisrt +" ");
		   int sum = fisrt + second;
		   fisrt = second;
		   second = sum;
		}
	}
}
