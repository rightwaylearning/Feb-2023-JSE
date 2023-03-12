package two_d_arrays;

public class RowsAndCols {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[3][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		
		arr[2][0] = 80;
		arr[2][1] = 90;
		arr[2][2] = 80;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("("+i+","+j+")"+"  ");
				
			}
			System.out.println();
			System.out.println();
			
		}
		
		
	}
}
