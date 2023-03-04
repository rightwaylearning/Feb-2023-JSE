package switch_Program;

public class SwitchWithBreak {
	public static void main(String[] args) {
		byte no = 80;
		switch (no) {
		default:{
			System.out.println("you choose wrong no");
			
		}
		case 10: {
			System.out.println("no is 10");
			break;
		}
		case 30: {
			System.out.println("no is 30");
			break;
		}
		case 70: {
			System.out.println("no is 70");
		}
		case 21: {
			System.out.println("no is 21");
		}
		
		}
	}

}
