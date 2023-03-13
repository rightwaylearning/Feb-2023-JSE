package arthimatic_opt;

import java.util.Iterator;

public class product {

	public static void main(String[] args) {
		
		int[][] arr1= {
				{1,2,3}	,
				{4,5,6}
				
       		  }; // 3 X 2
		
		int[][] arr2 = {
				{1,2},
				{3,4},
				{5,6} 
			};  // 2 X 3
		
		for (int i = 0; i < arr1.length; i++) {
			
			int sum = 0;
			
			for (int j = 0; j < arr1[i].length; j++) {
				sum = sum + arr1[i][j] * arr2[j][i];
			}
			System.out.println(sum +" ");
			
		}
		
	}
}
