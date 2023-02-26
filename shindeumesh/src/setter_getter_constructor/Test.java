package setter_getter_constructor;

public class Test {

	public static void main(String[] args) {

		Employ[] arr = new Employ[5];
		Employ E = new Employ();
		E.setEmployName("A");
		E.setEmployId(100);
		arr[0] = E;

		Employ E1 = new Employ();
		E1.setEmployId(50);
		E1.setEmployName("B");
		arr[1] = E1;

		Employ E2 = new Employ("C", 25);
		arr[2] = E2;

		arr[3] = new Employ("D", 15);

		arr[4] = new Employ("F", 10);
	Test.printEmployData(arr);
	}
		public static void printEmployData(Employ [] arr){
			
			
			
			System.out.println(arr[1].getEmployId());
			System.out.println(arr[3].getEmployName());
		}
		
		
		
	}	
		
	
		
		
	


