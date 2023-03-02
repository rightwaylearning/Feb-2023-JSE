package array_Assingment;

public class AdditionOfEven {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8};
		int index=0;
		int Addition=0;
		while(index<array.length)
		{
			System.out.println(array[index]);
			index=index+2;	
		}
		while(index<array.length)
		{
			Addition=Addition+array[index];
			index++;	
		}
		System.out.println(Addition);
		
	}

}
