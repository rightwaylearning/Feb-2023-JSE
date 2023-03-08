package while_loop_examples;

public class Test3 {
	
	public static void main(String[] args) {
		
		int[] numberArray = {100,200,300,400,500,600,700,800,900,1000};
		
		System.out.println("Befor Numbers");
		Printer.print(numberArray);
		
		int index=0;
		while(index < numberArray.length) {
			numberArray[index] = numberArray[index]+100;
			index++;
		}
		
		System.out.println("After");
		Printer.print(numberArray);
		
	}

}
