package exception_handlingbasic.examples;

public class HowToPrintExceptionMessage {

	public static void main(String[] args) {
		
		try {
			Integer i = Integer.valueOf("ten");
			
		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>");
		Integer i = Integer.valueOf("ten");
	}
}
