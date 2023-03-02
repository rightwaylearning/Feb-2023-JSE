package array;

public class Array {

	public static void main(String[] args) {
		
		int[] i = {1000,2000,3000,4000,5000,};
		
		int add = 0;
		int index = 0;
		
		while(index < i.length) {
		      add = add + i[index];
		      index++;
		      
		}
	
		System.out.println("Total "+ add );
	}
	
}
