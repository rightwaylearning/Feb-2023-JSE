package while_loop;


public class Test3 {
	
	public static void main(String[] args) {
		
		int[] numArray = {10,20,30,40,50};
		
		System.out.println("before ");
		Printer.print(numArray);
		
		int i = 0;
		while(i < numArray.length) {
			numArray[i] = numArray[i] + 100;
			i++;
		}
				
		System.out.println("after");
		Printer.print(numArray);
	}

}
