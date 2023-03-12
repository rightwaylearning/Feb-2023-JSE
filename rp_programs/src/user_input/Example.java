package user_input;

public class Example {

	public static void main(String[] args) {

		
		int[] arr = {32,43,54,23,54,22,68,98,43,21};
		
		
		int[] Output = new int[6];

		int j ;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				j = 0;
				
//				ata yachi value chukichi yete
				
				*******
//				ya madhe parat 0 initialize hoat aahe  tya mule kiti jari ghetla tari 0 j 
//				lach initilize hoat aahe 
				Output[j] = arr[i];
				j++;
			}

		}

		for (int k = 0; k < Output.length; k++) {

			System.out.println(Output[k]);
		}

	}

}
