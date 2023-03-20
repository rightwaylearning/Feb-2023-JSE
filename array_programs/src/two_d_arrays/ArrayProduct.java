package two_d_arrays;

import java.util.Iterator;

public class ArrayProduct {
	
	public static void main(String[] args) {
		
		int[][] arr1 = {
				{1,2,3}, // 00 , 01  02
			};
		int r1 = arr1.length;
		int c1 = arr1[0].length;
		
		int[][] arr2 = {
				{1,4,5},  //00
				{7,8,2},  //10
				{4,6,8}   //20
		};
		int r2 = arr2.length;
		int c2 = arr2[0].length;
		
		
		
		if(c1 == r2) {
			int[][] result = new int[r1][c2];
			
			for (int i = 0; i < r1; i++) {
				
				for (int j = 0; j < c2; j++) {
					
					
					for(int k =0; k<r2 ;k++) {
						result[i][j] = result[i][j] +   arr1[i][k] * arr2[k][j];        				
					}
					System.out.print(result[i][j]+" ");
					
				}
				System.out.println();
			}
			
			
		}
	}

}
