package array_Assingment;

public class OddIndexPrint {
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60};
		int index=1;
		while(index<array.length)
		{
			System.out.println(array[index]);
			index=index+2;
		}

		
	}
	
}
