package array_Assingment;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array= {23,56,78,7,55,99};
		int index=array.length-1;
		int reverse=0;
	
		while(index>=0)
		{
			reverse=array[index];
			index--;
			
			System.out.println(reverse);
			
		}
	}

}
