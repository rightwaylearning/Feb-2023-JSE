package sumof_array_element;

public class SumOfArrayElement 
{
	public static void main(String[] args) {
		
		int [] arr= {10,20,30,40,40,70,780,57867,354658};
		int index=0;
		int sum=0;
		while(index <arr.length)
		{
		   sum = sum+arr[index];
		   index++;
		}
		System.out.println("Total "+sum);
	}

}
