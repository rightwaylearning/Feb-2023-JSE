package finally_block;

public class GK1 {

	public static void main(String[] args) {
		
		
		GK1 g = new GK1();
		g.printData();
	}
	
     void printData() {
		System.out.println("start");
		for(int i = 1; i <=  50; i++) {
			
			System.out.println(i);
			
			if(i ==10) {
				return;
			}
		}
		System.out.println("end");
		
	}
}
