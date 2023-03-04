package for_loop;

public class Case {
	
	public static void main(String[] args) {
		
	int i = 1;
		
		while(i<10) {
		
			System.out.println("hello" + i);
			i++;
//			i = int(i) + 1
		} 
		
		System.out.println(i);
		
	final	int i3 = 1;
		
//	kela tr compile time constant rahate yachi value
//		aata yala aapn local madhe output kadhu nahu shakat 
		
		for(int i2 = 0 ; i< 10 ; i++) {
			System.out.println( i3);
		}
	
		System.out.println(i3);
		
	}
	

}
